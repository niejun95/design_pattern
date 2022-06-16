package dynamicserviceinvoke;

import org.springframework.stereotype.Component;

/**
 * @author : niejun
 * @Description: TODO
 * @date Date : 2022年06月16日 23:11
 **/
@AnnotationProcess(value = "test1")
@Component
public class TaskProcessorOther implements AnnotationService<AnnotationParam>{
    @Override
    public void process(AnnotationParam param) {
        System.out.println("处理业务2");
    }
}
