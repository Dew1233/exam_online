package com.yegol.exam_online.service.impl;

import com.yegol.exam_online.entity.Question;
import com.yegol.exam_online.service.QuestionService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class QuestionServiceImplTest {

    @Autowired
    private QuestionService questionService;
    @Test
    void getAll() {
        List<Question> questionList = questionService.getAll();
        log.debug("问题列表{}",questionList);
    }
}