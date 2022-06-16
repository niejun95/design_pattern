package strategytree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName Node
 * @Author niejun
 * @Date 2022/6/16
 * @Description: 根节点
 * @Version 1.0
 **/
@Component
public class Node extends NodeTemplate<Integer, String> {
    @Autowired
    private Node1 node1;

    @Autowired
    private Node2 node2;

    @Override
    NodeTemplate<Integer, String> chooseNodeExecute(Integer param) {
        if (param > 200) {
            return node1;
        }
        return node2;

    }
}
