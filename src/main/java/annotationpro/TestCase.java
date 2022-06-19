package annotationpro;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : niejun
 * @Description: TODO
 * @date Date : 2022年06月18日 13:16
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class TestCase {
    @Autowired
    ServiceTask serviceTask;

    @Test
    public void test() {
        Object test = serviceTask.getData("test");
        System.out.println(test);
    }
}
