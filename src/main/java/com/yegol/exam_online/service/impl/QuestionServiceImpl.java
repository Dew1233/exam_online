package com.yegol.exam_online.service.impl;

import com.yegol.exam_online.entity.Question;
import com.yegol.exam_online.mapper.QuestionMapper;
import com.yegol.exam_online.service.QuestionService;
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
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements QuestionService {
   @Autowired
   private  QuestionMapper questionMapper;
    @Override
    public List<Question> getAll() {
        return questionMapper.selectList(null);
    }
}
