package life.decade.community.community.dto;

import lombok.Data;

/**
 * @author java
 * @create 2019-10-17 22:54
 */
@Data
public class AccessTokenDTO {

    /**
     * 用户填写自动生成的ID
     */
    private String client_id;

    /**
     * 用户填写自动生成的secret
     */
    private String client_secret;

    /**
     *
     */
    private String code;

    /**
     * 回调地址
     */
    private String redirect_uri;

    private String state;

}
