package strategytree;

/**
 * 路由定义
 */
public interface StrategyMap<P, R> {
    StrategyHandler<P, R> get(P param);
}
