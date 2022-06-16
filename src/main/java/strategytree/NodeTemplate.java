package strategytree;

/**
 * @author : niejun
 * @Description: 策略树节点的模板类
 * @date Date : 2022年06月16日 21:53
 **/
public abstract class NodeTemplate<P, R> {

    abstract NodeTemplate<P, R> chooseNodeExecute(P param);

     R execute(P param) {
         NodeTemplate<P, R> node = chooseNodeExecute(param);
         return node.execute(param);
     }
}
