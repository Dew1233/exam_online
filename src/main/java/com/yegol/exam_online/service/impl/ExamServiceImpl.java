package com.yegol.exam_online.service.impl;

import com.yegol.exam_online.entity.Exam;
import com.yegol.exam_online.mapper.ExamMapper;
import com.yegol.exam_online.service.ExamService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YeGol
 * @since 2021-04-09
 */
@Service
public class ExamServiceImpl extends ServiceImpl<ExamMapper, Exam> implements ExamService {
    @Autowired
    private ExamMapper examMapper;

    public List<Exam> getAll(){
        return examMapper.selectList(null);
    }
}
