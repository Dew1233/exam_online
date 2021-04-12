package com.yegol.exam_online.controller;


import com.yegol.exam_online.entity.Exam;
import com.yegol.exam_online.service.ExamService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
//@RequestMapping("/exam")

public class ExamController {
    @Autowired
    private ExamService examService;
    @RequestMapping("/examlist")
    @ResponseBody
    public List examList(){
        List<Exam> examList = examService.getAll();
        return examList;
    }
}

