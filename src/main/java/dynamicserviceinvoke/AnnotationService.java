package dynamicserviceinvoke;

/**
 * @author : niejun
 * @Description: TODO
 * @date Date : 2022年06月16日 23:03
 **/
public interface AnnotationService<P> {
    /**
     * 不同服务调用不同方法
     */
    void process(P param);
}
