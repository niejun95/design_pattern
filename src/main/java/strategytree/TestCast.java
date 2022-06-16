package strategytree;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : niejun
 * @Description: 测试类
 * @date Date : 2022年06月16日 22:33
 **/
public class TestCast {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Node node = context.getBean("node", Node.class);

        System.out.println(node.execute(300));


    }
}
