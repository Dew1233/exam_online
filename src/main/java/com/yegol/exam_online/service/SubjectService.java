package com.yegol.exam_online.service;

import com.yegol.exam_online.entity.Subject;
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
public interface SubjectService extends IService<Subject> {

    List<Subject> getAll();
}
