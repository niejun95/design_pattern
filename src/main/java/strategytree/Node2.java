package strategytree;


import org.springframework.stereotype.Component;

/**
 * @author : niejun
 * @Description: 节点2
 * @date Date : 2022年06月16日 22:01
 **/
@Component
public class Node2 extends NodeTemplate<Integer, String> {

    @Override
    NodeTemplate<Integer, String> chooseNodeExecute(Integer param) {
        return this;
    }

    @Override
    String execute(Integer param) {
        String result = new String("低级");
        return null;
    }
}
