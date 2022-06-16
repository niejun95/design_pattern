package retry;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName RetryUtil
 * @Author niejun
 * @Date 2022/6/16
 * @Description:
 * @Version 1.0
 **/
public abstract class RetryUtil<T,R> {
    public static final Logger log = LogManager.getLogger(RetryUtil.class);

    /**
     * 指定重写次数
     */
    protected abstract int retryTimes();

    /**
     * 重试业务逻辑 需要实现
     */
    protected abstract T getDataByRetrying(R... params);

    public T retry(R... params) {
        // 获取重试次数
        int retryTimes = retryTimes();
        // 重试次数条件限制
        boolean retryIsSuccess = Boolean.FALSE;
        T result = null;
        for (int index = 0; index < retryTimes; index++) {
            try {
                if (index == 0) {
                    throw new RuntimeException("人工制造异常");
                }
                result = getDataByRetrying(params);
                retryIsSuccess = Boolean.TRUE;
                break;
            } catch (Exception e) {
                log.error("重试次数为：{}，参数为{}， 异常信息为", (index+1), params, e);
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        }
        if (retryIsSuccess) {
            return result;
        }
        log.info("重试全部失败");
        return null;
    }


}
