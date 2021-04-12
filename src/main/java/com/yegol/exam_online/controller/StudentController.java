package com.yegol.exam_online.controller;


import com.yegol.exam_online.entity.Student;
import com.yegol.exam_online.service.StudentService;
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
//@RequestMapping("/student")
public class StudentController {
@Autowired
    private StudentService studentService;
@RequestMapping("/studentlist")
    @ResponseBody
    public List studentList(){
    List<Student> studentList = studentService.getAll();
    return studentList;
}
}

