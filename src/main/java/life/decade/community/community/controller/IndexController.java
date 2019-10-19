package life.decade.community.community.controller;

import life.decade.community.community.dto.QuestionDTO;
import life.decade.community.community.mapper.UserMapper;
import life.decade.community.community.model.User;
import life.decade.community.community.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author java
 * @create 2019-10-17 17:05
 */
@Controller
public class IndexController {

    @Resource
    private UserMapper userMapper;

    @Resource
    private QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")) {
                    String token = cookie.getValue();
                    User user = userMapper.findByToken(token);
                    if (user != null) {
                        System.out.println("user = " + user);
                        request.getSession().setAttribute("user", user);
                    }
                    break;
                }
            }
        }

        //查询列表数据
        List<QuestionDTO> questionDTOList = questionService.findAll();
        System.out.println("questionDTOList = " + questionDTOList);
        model.addAttribute("questionDTOList", questionDTOList);

        return "index";
    }

}

