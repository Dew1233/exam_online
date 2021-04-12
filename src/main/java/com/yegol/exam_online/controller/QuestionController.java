package com.yegol.exam_online.controller;


import com.yegol.exam_online.entity.Question;
import com.yegol.exam_online.service.QuestionService;
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
//@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @RequestMapping("/questionlist")
    @ResponseBody
    public List questionList(){
        List<Question> questionList = questionService.getAll();
        return questionList;
    }

}

