package com.yegol.exam_online.controller;


import com.yegol.exam_online.entity.User;
import com.yegol.exam_online.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YeGol
 * @since 2021-04-09
 */
@Controller
//@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/userlist")
    @ResponseBody
    public List userList(){
        List<User> userlist = userService.getAll();
        return userlist;
    }

}

