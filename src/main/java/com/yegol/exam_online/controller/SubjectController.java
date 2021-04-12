package com.yegol.exam_online.controller;


import com.yegol.exam_online.entity.Subject;
import com.yegol.exam_online.service.SubjectService;
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
//@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;
    @RequestMapping("/subjectlist")
    @ResponseBody
    public List subjectList(){
        List<Subject> subjectlist = subjectService.getAll();
        return subjectlist;
    }
}

