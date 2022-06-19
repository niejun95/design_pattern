package annotationpro;

import org.springframework.stereotype.Component;

/**
 * @author : niejun
 * @Description: niejun
 * @date Date : 2022年06月18日 12:54
 **/
@Component
public class ServiceTask {

    @ClassMethodAuthLog(logInfo = "ServiceTask#getData", auth="user")
    public Object getData(String param) {
        //if (true) {
        //    throw new RuntimeException("人为异常");
        //}
        System.out.println("正常业务逻辑被执行");
        return param + "执行成功";
    }
}
