package strategytree;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import java.util.Objects;

/**
 * @ClassName StrategyTemplate
 * @Author niejun
 * @Date 2022/6/16
 * @Description:
 * @Version 1.0
 **/
public abstract class StrategyTemplate<P, R> {

    private StrategyMap<P, R> strategyMap;

    /**
     * 类初始化时分发策略
     */
    @PostConstruct
    public void abstractInit() {
        strategyMap = registerStrategyMap();
        Objects.requireNonNull(strategyMap, "strategyMapper cannot be null");
    }

    /**
     * 分发逻辑
     */
    protected abstract StrategyMap<P,R> registerStrategyMap();

    @Setter
    @Getter
    private StrategyHandler<P, R> defaultStrategyHandler = StrategyHandler.DEFAULT;

    /**
     * 执行策略, 框架会根据策略发至下游的 handler 进行处理
     * @return 下游执行者给出的返回值
     */
    public R appStrategy(P param) {
        final StrategyHandler<P, R> strategyHandler = strategyMap.get(param);

        if (strategyHandler != null) {
            return strategyHandler.apply(param);
        }
        return defaultStrategyHandler.apply(param);
    }
}
