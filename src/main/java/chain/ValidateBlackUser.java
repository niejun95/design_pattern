package chain;

/**
 * @ClassName ValidateBlackUser
 * @Author niejun
 * @Date 2022/5/31
 * @Description:
 * @Version 1.0
 **/
public class ValidateBlackUser extends AbstractHandler<User>{

    private static final String BLACK_USER = "xiaowang";

    @Override
    public Boolean doChain(User user) {
        if (BLACK_USER.equals(user.getUsername())) {
            System.out.println("黑名单校验未通过");
            return false;
        }
        System.out.println("黑名单验证通过");
        return true;
    }
}
