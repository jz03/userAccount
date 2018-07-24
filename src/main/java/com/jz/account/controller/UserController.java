package com.jz.account.controller;

import com.jz.account.model.User;
import com.jz.account.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author szg
 * @create 2017-12-07 15:40
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ModelAndView index(User user) {
        return userService.queryUserList(user);
    }
}
