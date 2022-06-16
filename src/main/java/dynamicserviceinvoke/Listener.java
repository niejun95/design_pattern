package dynamicserviceinvoke;

public interface Listener {
    /**
     * 模拟接受消息接口
     * @param type
     */
    void receive(AnnotationParam type);
}
