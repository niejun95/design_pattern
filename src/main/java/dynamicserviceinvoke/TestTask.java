package dynamicserviceinvoke;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author : niejun
 * @Description: 接受消息接口实现
 * @date Date : 2022年06月16日 23:11
 **/
@Data
@Component
public class TestTask implements Listener{

    @Autowired
    private AnnotationConfig annotationConfig;


    @Override
    public void receive(AnnotationParam type) {
        if (Objects.isNull(type.getBizType())) {
            throw new RuntimeException("传参不能为空");
        }
        AnnotationService<AnnotationParam> service = annotationConfig.getArchiveService(type.getBizType());
        if (service!= null) {
            service.process(type);
        }
    }
}
