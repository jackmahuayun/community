package life.decade.community.community.service.impl;

import life.decade.community.community.dto.QuestionDTO;
import life.decade.community.community.mapper.QuestionMapper;
import life.decade.community.community.mapper.UserMapper;
import life.decade.community.community.model.Question;
import life.decade.community.community.model.User;
import life.decade.community.community.service.QuestionService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author java
 * @create 2019-10-19 11:22
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private QuestionMapper questionMapper;

    @Override
    public List<QuestionDTO> findAll() {

        List<Question> questionList = questionMapper.findAll();

        List<QuestionDTO> questionDTOList = new ArrayList<>(12);
        for (Question question : questionList) {
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }

        return questionDTOList;
    }
}
