package chain;

/**
 * @ClassName TestResponsibility
 * @Author niejun
 * @Date 2022/5/31
 * @Description: 测试类
 * @Version 1.0
 **/
public class TestResponsibility {
    public static void main(String[] args) {
        User user = new User("lisi", "123456", "1478");
        RequestHandler.doRequest(user);
    }
}
