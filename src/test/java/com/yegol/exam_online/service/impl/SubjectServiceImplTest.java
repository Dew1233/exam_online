package com.yegol.exam_online.service.impl;

import com.yegol.exam_online.entity.Subject;
import com.yegol.exam_online.service.SubjectService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SubjectServiceImplTest {

    @Autowired
    private SubjectService subjectService;
    @Test
    void getAll() {
        List<Subject> list = subjectService.getAll();
        System.out.println(list);
    }
}