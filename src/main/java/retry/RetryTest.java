package retry;

import java.util.Optional;

/**
 * @ClassName RetryTest
 * @Author niejun
 * @Date 2022/6/16
 * @Description:
 * @Version 1.0
 **/
public class RetryTest {
    public static void main(String[] args) {
//        SimpleTask simpleTask =  new SimpleTask();
//
//        simpleTask.retry("jack");

        RetryUtilPro<String> retryUtilPro = RetryUtilPro.fromTask(() -> {
            return "jack";
        }).retryTimes(4).retryTimeLong(100L);

        Optional<String> result = retryUtilPro.getResult();
        System.out.println(result.get());
    }
}
