package life.decade.community.community.controller;

import life.decade.community.community.mapper.UserMapper;
import life.decade.community.community.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author java
 * @create 2019-10-17 17:05
 */
@Controller
public class IndexController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
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
        return "index";
    }

}

