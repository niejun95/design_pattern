package dynamicserviceinvoke;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : niejun
 * @Description: TODO
 * @date Date : 2022年06月16日 23:03
 **/
@Data
public class AnnotationParam implements Serializable {
    /**
     * 业务类型
     */
    private String bizType;
}
