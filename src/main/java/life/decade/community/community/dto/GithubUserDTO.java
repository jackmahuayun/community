package life.decade.community.community.dto;

import lombok.Data;

/**
 * @author java
 * @create 2019-10-18 09:15
 */
@Data
public class GithubUserDTO {

    /**
     * 填写的用户名
     */
    private String name;

    /**
     * 唯一生成的ID
     */
    private Long id;

    /**
     * 填写的bio信息
     */
    private String bio;

    /**
     * 用户头像
     */
    private String avatarUrl;

}
