package com.yegol.exam_online.service.impl;

import com.yegol.exam_online.entity.Student;
import com.yegol.exam_online.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class StudentServiceImplTest {

    @Autowired
    private StudentService studentService;
    @Test
    void getAll() {
        List<Student> list = studentService.getAll();
        System.out.println(list);
    }
}