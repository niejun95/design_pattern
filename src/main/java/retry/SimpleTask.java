package retry;

/**
 * @ClassName SimpleTask
 * @Author niejun
 * @Date 2022/6/16
 * @Description:
 * @Version 1.0
 **/
public class SimpleTask extends RetryUtil<String, String>{
    @Override
    protected int retryTimes() {
        return 4;
    }

    @Override
    protected String getDataByRetrying(String... params) {
        String str = params[0] + "来玩啊";
        System.out.println(str);
        return str;
    }
}
