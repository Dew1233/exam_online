package com.yegol.exam_online.controller;


import com.yegol.exam_online.entity.Exampaper;
import com.yegol.exam_online.service.ExamService;
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
//@RequestMapping("/exampaper")
public class ExampaperController {
    @Autowired
    private ExamService examService;
    @RequestMapping("/exampaperlist")
    @ResponseBody
    public List exampaperList(){
        return examService.getAll();
    }
}

