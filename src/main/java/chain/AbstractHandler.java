package chain;

/**
 * @ClassName AbstractHandler
 * @Author niejun
 * @Date 2022/5/31
 * @Description: 抽象链路AbstractHandler（建造者模式构造链路）
 * @Version 1.0
 **/
public abstract class AbstractHandler<T> {
    protected AbstractHandler chain;

    public void next(AbstractHandler handler) {
        this.chain = handler;
    }

    public void doHandler(T t) {
        boolean result = doChain(t);
        if (result == true) {
            if (chain != null) {
                chain.doHandler(t);
            }
        }
        return;
    }

    public abstract Boolean doChain(T t);

    public static class Builder<T> {
        private AbstractHandler<T> head;

        private AbstractHandler<T> tail;

        // 尾插法
        public Builder<T> addHandler(AbstractHandler<T> handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }

        public AbstractHandler<T> build() {
            return this.head;
        }
    }
}
