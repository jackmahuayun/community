package life.decade.community.community.dto;

import lombok.Data;

/**
 * @author java
 * @create 2019-10-17 22:54
 */
@Data
public class AccessTokenDTO {

    private String client_id;

    private String client_secret;

    private String code;

    private String redirect_uri;

    private String state;

}
