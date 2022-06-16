package strategytree;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TestCase
 * @Author niejun
 * @Date 2022/6/16
 * @Description:
 * @Version 1.0
 **/
public class TestCase {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Node node = context.getBean("node", Node.class);
        Param2 param2 = new Param2();
        param2.setCondition1(100);
        param2.setCondition1(200);
        Param1 apply2 = node.apply(param2);
        System.out.println(apply2);
    }
}
