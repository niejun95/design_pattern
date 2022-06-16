package strategytree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName Node2
 * @Author niejun
 * @Date 2022/6/16
 * @Description:
 * @Version 1.0
 **/
@Component
public class Node2 extends StrategyTemplate<Param2, Param1> implements StrategyHandler<Param2, Param1>{
    @Autowired
    Node3 node3;

    @Override
    public Param1 apply(Param2 condition) {
        System.out.println("当前节点是node2");
        if (condition.getCondition2() == 400) {
            Param1 param1 = new Param1();
            param1.condition2 = 500;
            return param1;
        }
        return this.appStrategy(condition);
    }

    @Override
    protected StrategyMap<Param2, Param1> registerStrategyMap() {
        return param -> param.getCondition2() == 400 ? StrategyHandler.DEFAULT : node3;
    }
}
