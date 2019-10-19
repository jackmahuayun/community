package life.decade.community.community.dto;

import life.decade.community.community.model.User;
import lombok.Data;

/**
 * @author java
 * @create 2019-10-19 11:19
 */
@Data
public class QuestionDTO {

    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Long gmtCreate;

    /**
     * 修改时间
     */
    private Long gmtModified;

    /**
     * 发布人的ID
     */
    private Integer creator;

    /**
     * 评论数
     */
    private Integer commentCount;

    /**
     * 浏览数
     */
    private Integer viewCount;

    /**
     * 点赞数
     */
    private Integer likeCount;

    /**
     * 标签
     */
    private String tag;

    /**
     * 用户信息
     */
    private User user;

}
