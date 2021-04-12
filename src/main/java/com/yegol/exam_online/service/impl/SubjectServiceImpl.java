package com.yegol.exam_online.service.impl;

import com.yegol.exam_online.entity.Subject;
import com.yegol.exam_online.mapper.SubjectMapper;
import com.yegol.exam_online.service.SubjectService;
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
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject> implements SubjectService {

    @Autowired
    private SubjectMapper subjectMapper;
    @Override
    public List<Subject> getAll() {
        return subjectMapper.selectList(null);
    }
}
