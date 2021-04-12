package com.yegol.exam_online.service;

import com.yegol.exam_online.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YeGol
 * @since 2021-04-09
 */
public interface StudentService extends IService<Student> {

    List<Student> getAll();
}
