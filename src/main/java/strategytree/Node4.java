package strategytree;

import org.springframework.stereotype.Component;

/**
 * @ClassName Node4
 * @Author niejun
 * @Date 2022/6/16
 * @Description:
 * @Version 1.0
 **/
@Component
public class Node4 extends StrategyTemplate<Param2, Param1> implements StrategyHandler<Param2, Param1>{

    @Override
    public Param1 apply(Param2 condition) {
        System.out.println("当前节点是node4");
        if (condition.getCondition2() == 300) {
            Param1 param1 = new Param1();
            param1.setCondition1(300);
            return param1;
        }
        return this.appStrategy(condition);
    }

    @Override
    protected StrategyMap<Param2, Param1> registerStrategyMap() {
        return param -> StrategyHandler.DEFAULT;
    }
}
