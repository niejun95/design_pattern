package annotationpro;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author : niejun
 * @Description: TODO
 * @date Date : 2022年06月18日 13:23
 **/
@ComponentScan(basePackages = "annotationpro")
@Configuration
@EnableAspectJAutoProxy
public class Config {
}
