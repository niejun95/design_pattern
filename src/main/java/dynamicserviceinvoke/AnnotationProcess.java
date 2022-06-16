package dynamicserviceinvoke;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 * @author niejun
 */
@Service
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AnnotationProcess {
    String value();
}
