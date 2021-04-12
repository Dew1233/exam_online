package com.yegol.exam_online.controller;


import com.yegol.exam_online.entity.Menu;
import com.yegol.exam_online.service.MenuService;
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
//@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;
    @RequestMapping("/menulist")
    @ResponseBody
    public List menuList(){
        List<Menu> menuList = menuService.getAll();
        return menuList;
    }
}

