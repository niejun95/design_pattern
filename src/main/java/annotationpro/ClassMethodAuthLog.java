package annotationpro;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author niejun
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassMethodAuthLog {
    /**
     * 打印的消息
     */
    String logInfo();

    /**
     * 执行的方法
     */
    String auth();

}
