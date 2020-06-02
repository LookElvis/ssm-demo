package com.hnu.elvis.controller;

import com.hnu.elvis.entity.User;
import com.hnu.elvis.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Elvis on 2020/6/1.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUser")
    @ResponseBody
    private List<User> getAllUser() {
        List<User> users = userService.getAllUser();
        return users;
    }
}