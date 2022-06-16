package strategytree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @ClassName Node
 * @Author niejun
 * @Date 2022/6/16
 * @Description:
 * @Version 1.0
 **/
@Component
public class Node extends StrategyTemplate<Param2, Param1> implements StrategyHandler<Param2, Param1>{
    @Autowired
    Node1 node1;

    @Autowired
    Node2 node2;

    @Override
    public Param1 apply(Param2 condition) {
        System.out.println("当前节点是Node");
        Param1 param1 = this.appStrategy(condition);
        if (Objects.isNull(param1)) {
            return null;
        }
        param1.setCondition1(800);
        return param1;
    }

    @Override
    protected StrategyMap<Param2, Param1> registerStrategyMap() {
        return param -> {
            if (param.getCondition1() > param.getCondition2()) {
                return node1;
            }
            return node2;
        };
    }
}
