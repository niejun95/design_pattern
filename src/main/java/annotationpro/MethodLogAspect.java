package annotationpro;

import lombok.SneakyThrows;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationUtils;

import java.util.Arrays;


/**
 * @author : niejun
 * @Description: niejun
 * @date Date : 2022年06月18日 12:54
 **/
@Aspect
@Configuration
public class MethodLogAspect {

    public static final Logger log  = LogManager.getLogger(MethodLogAspect.class);

    // 标注classMethodAuthLog 注解的方法均会调用此方法
    @Around("@annotation(annotationpro.ClassMethodAuthLog)")
    @SneakyThrows
    public Object processPerform(ProceedingJoinPoint point) {
        ClassMethodAuthLog annotation =
                AnnotationUtils.findAnnotation(((MethodSignature)point.getSignature()).getMethod(), ClassMethodAuthLog.class);
        String methodLog = annotation.logInfo();
        String auth = annotation.auth();
        Object[] args = point.getArgs();
        System.out.println("==============");
        Arrays.stream(args).forEach(System.out::println);
        String paramValue = (String) args[0];
        // 模拟鉴权
        Boolean aBoolean = authCheck(paramValue, auth);
        if (!aBoolean) {
            throw new RuntimeException("没有数据");
        }
        log.info(methodLog + "#" + paramValue);
        return point.proceed();

    }

    public Boolean authCheck(String param, String name) {
        return true;
    }

}
