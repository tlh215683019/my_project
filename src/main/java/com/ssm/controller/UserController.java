package com.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.dao.UserDao;
import com.ssm.domain.User;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserDao userDao;

    @RequestMapping("/view")
    public String view() {
        return "/login";
    }

    @RequestMapping("/indexview")
    public String index() {
        return "/indexs";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(User user) {
    	System.out.println("username:"+user.getUsername()+" password:"+user.getPassword());
       /* User user = userDao.findByUsername(model.getUsername());
        if (user == null || !user.getPassword().equals(model.getPassword())) {
            return new ModelAndView("redirect:/login.jsp");
        } else {
            session.setAttribute("user", user);
            ModelAndView mav = new ModelAndView();
            mav.setViewName("index");
            return mav;
        }*/
    	 return new ModelAndView("redirect:/indexs.jsp");
    }
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @ResponseBody
    public String query(User user) {
    	 return "{\"result\":\"hello\"}";
    }
}
