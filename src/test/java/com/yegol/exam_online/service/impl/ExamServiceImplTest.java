package com.yegol.exam_online.service.impl;

import com.yegol.exam_online.entity.Exam;
import com.yegol.exam_online.service.ExamService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class ExamServiceImplTest {

    @Autowired
    private ExamService examService;
    @Test
    void getAll() {
        List<Exam> examList = examService.getAll();
        log.debug("examlist:{}",examList);

    }
}