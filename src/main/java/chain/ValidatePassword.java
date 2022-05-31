package chain;


import org.apache.commons.lang.StringUtils;

/**
 * @ClassName ValidatePassword
 * @Author niejun
 * @Date 2022/5/31
 * @Description: 用户名密码认证
 * @Version 1.0
 **/
public class ValidatePassword extends AbstractHandler<User>{

    private static final String PASSWORD = "123456";

    @Override
    public Boolean doChain(User user) {
        if (user == null || StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {
            System.out.println("用户名和密码不能为空");
            return false;
        }
        if (!PASSWORD.equals(user.getPassword())) {
            System.out.println("密码错误");
            return false;
        }
        System.out.println("用户名密码验证通过");
        return true;
    }
}
