package dynamicserviceinvoke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : niejun
 * @Description: 配置类
 * @date Date : 2022年06月16日 23:01
 **/
@Configuration
@ComponentScan(basePackages = "dynamicserviceinvoke")
public class AnnotationConfig {

    private final Map<String, AnnotationService<AnnotationParam>> archiveServiceMap = new HashMap<>();

    /**
     * 服务启动的时候自动注册到我们定义的map中
     */
    @Autowired
    public void init(List<AnnotationService<AnnotationParam>> annotationServices) {
        for (AnnotationService<AnnotationParam> annotationService : annotationServices) {
            AnnotationProcess processValue = AnnotationUtils.findAnnotation(annotationService.getClass(),
                    AnnotationProcess.class);
            archiveServiceMap.put(processValue.value(), annotationService);
        }
    }

    public AnnotationService<AnnotationParam> getArchiveService(String type) {
        return archiveServiceMap.get(type);
    }


}
