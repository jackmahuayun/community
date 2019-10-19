package life.decade.community.community.model;

import lombok.Data;

import java.util.Date;

/**
 * @author java
 * @create 2019-10-18 13:51
 */
@Data
public class User {

    private Integer id;

    private String accountId;

    private String name;

    private String token;

    private Long gmtCreate;

    private Long gmtModified;

    /**
     * 头像
     */
    private String avatarUrl;

}
