package life.decade.community.community.service;

import life.decade.community.community.dto.QuestionDTO;

import java.util.List;

/**
 * @author java
 * @create 2019-10-19 11:18
 */
public interface QuestionService {

    List<QuestionDTO> findAll();

}
