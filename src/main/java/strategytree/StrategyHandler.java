package strategytree;

public interface StrategyHandler<P, R> {
    // 默认实现
    StrategyHandler DEFAULT = t -> null;

    R apply(P condition);
}
