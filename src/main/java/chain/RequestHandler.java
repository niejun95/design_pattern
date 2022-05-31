package chain;

/**
 * @ClassName RequestHandler
 * @Author niejun
 * @Date 2022/5/31
 * @Description:
 * @Version 1.0
 **/
public class RequestHandler {
    private static AbstractHandler abstractHandler;

    static {
        AbstractHandler.Builder builder = new AbstractHandler.Builder();
        builder.addHandler(new ValidatePassword())
                .addHandler(new ValidateCaptcha())
                .addHandler(new ValidateBlackUser());
        abstractHandler = builder.build();
    }

    public static void doRequest(User user) {
        abstractHandler.doHandler(user);
    }
}
