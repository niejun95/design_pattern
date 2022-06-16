package strategytree;

import org.springframework.stereotype.Component;

/**
 * @ClassName Node1
 * @Author niejun
 * @Date 2022/6/16
 * @Description: 节点1
 * @Version 1.0
 **/
@Component
public class Node1 extends NodeTemplate<Integer, String> {

    @Override
    NodeTemplate<Integer, String> chooseNodeExecute(Integer param) {
        return this;
    }

    @Override
    String execute(Integer param) {
        String result = new String("高级");
        return result;
    }
}
