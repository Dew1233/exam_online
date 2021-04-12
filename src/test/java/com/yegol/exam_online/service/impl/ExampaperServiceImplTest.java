package com.yegol.exam_online.service.impl;

import com.yegol.exam_online.entity.Exampaper;
import com.yegol.exam_online.service.ExamService;
import com.yegol.exam_online.service.ExampaperService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class ExampaperServiceImplTest {
    @Autowired
    private ExampaperService exampaperService;
    @Test
    void getAll() {
        List<Exampaper> list = exampaperService.getAll();
        log.debug("参数：{}",list);
    }
}