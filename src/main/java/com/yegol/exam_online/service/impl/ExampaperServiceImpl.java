package com.yegol.exam_online.service.impl;

import com.yegol.exam_online.entity.Exampaper;
import com.yegol.exam_online.mapper.ExampaperMapper;
import com.yegol.exam_online.service.ExampaperService;
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
public class ExampaperServiceImpl extends ServiceImpl<ExampaperMapper, Exampaper> implements ExampaperService {

    @Autowired
    private ExampaperMapper exampaperMapper;
    @Override
    public List<Exampaper> getAll() {
        return exampaperMapper.selectList(null);
    }
}
