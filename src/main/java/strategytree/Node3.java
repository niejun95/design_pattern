package strategytree;

import org.springframework.stereotype.Component;

/**
 * @ClassName Node3
 * @Author niejun
 * @Date 2022/6/16
 * @Description:
 * @Version 1.0
 **/
@Component
public class Node3 extends StrategyTemplate<Param2, Param1> implements StrategyHandler<Param2, Param1>{

    @Override
    public Param1 apply(Param2 condition) {
        System.out.println("当前节点是node3");
        if (condition.getCondition2() == 500) {
            Param1 param1 = new Param1();
            param1.setCondition1(500);
            return param1;
        }
        return this.appStrategy(condition);
    }

    @Override
    protected StrategyMap<Param2, Param1> registerStrategyMap() {
        return param -> StrategyHandler.DEFAULT;
    }
}
