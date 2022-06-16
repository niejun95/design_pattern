package dynamicserviceinvoke;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : niejun
 * @Description: 测试类
 * @date Date : 2022年06月16日 23:30
 **/
public class TestCase {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        TestTask testTask = context.getBean("testTask", TestTask.class);

        AnnotationParam annotationParam = new AnnotationParam();
        annotationParam.setBizType("test");

        AnnotationParam annotationParam1 = new AnnotationParam();
        annotationParam1.setBizType("test1");

        testTask.receive(annotationParam1);
    }
}
