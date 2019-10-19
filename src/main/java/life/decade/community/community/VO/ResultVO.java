package life.decade.community.community.VO;

import lombok.Data;

/**
 * @author java
 * @create 2019-10-18 22:18
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String message;

    private T data;

}
