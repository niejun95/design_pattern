package chain;

import org.apache.commons.lang.StringUtils;

/**
 * @ClassName ValidateCaptcha
 * @Author niejun
 * @Date 2022/5/31
 * @Description: 验证码校验
 * @Version 1.0
 **/
public class ValidateCaptcha extends AbstractHandler<User>{

    private static final String CAPTCHA = "qwer";

    @Override
    public Boolean doChain(User user) {
        if (StringUtils.isBlank(user.getCaptcha()) || !CAPTCHA.equals(user.getCaptcha())) {
            System.out.println("验证码错误");
            return false;
        }
        System.out.println("验证码验证通过");
        return true;
    }
}
