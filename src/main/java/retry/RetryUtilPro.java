package retry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * @ClassName RetryUtilLomda
 * @Author niejun
 * @Date 2022/6/16
 * @Description:
 * @Version 1.0
 **/
public class RetryUtilPro<T> {
    public static final Logger log = LogManager.getLogger(RetryUtilPro.class);

    private long retryTimeLong = 500L;

    private int retryTimes = 3;

    private T result;

    private Supplier<T> supplier;

    public static <T> RetryUtilPro<T> fromTask(Supplier<T> supplier) {
        RetryUtilPro<T> retryUtil = new RetryUtilPro<T>();
        return retryUtil.setSupplier(supplier);
    }

    public RetryUtilPro<T> setSupplier(Supplier<T> supplier) {
        this.supplier = supplier;
        return this;
    }

    public RetryUtilPro<T> retryTimes(int retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }

    public RetryUtilPro<T> retryTimeLong(long retryTimeLong) {
        this.retryTimeLong = retryTimeLong;
        return this;
    }

    public Optional<T> getResult() {
        int curRetryTime = 0;
        boolean retryIsSuccess = Boolean.FALSE;

        while (curRetryTime < retryTimes + 1) {
            try {
                result = this.supplier.get();
                if (curRetryTime < retryTimes) {
                    curRetryTime++;
                    throw new RuntimeException("人造异常");
                }
                curRetryTime++;
                retryIsSuccess = Boolean.TRUE;
            } catch (RuntimeException e) {
                log.info("第{}次发生异常,报错信息为{}", curRetryTime, e);
                if (curRetryTime < this.retryTimes) {
                    // 进行下一轮重试
                    try {
                        Thread.sleep(retryTimeLong);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    continue;
                }
            }
        }
        if (retryIsSuccess) {
            return Optional.ofNullable(result);
        }
        return Optional.empty();
    }


}
