package com.yegol.exam_online.service.impl;

import com.yegol.exam_online.entity.Student;
import com.yegol.exam_online.mapper.StudentMapper;
import com.yegol.exam_online.service.StudentService;
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
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> getAll() {
        return studentMapper.selectList(null);
    }
}
