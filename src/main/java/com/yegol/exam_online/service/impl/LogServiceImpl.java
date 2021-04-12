package com.yegol.exam_online.service.impl;

import com.yegol.exam_online.entity.Log;
import com.yegol.exam_online.mapper.LogMapper;
import com.yegol.exam_online.service.LogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YeGol
 * @since 2021-04-09
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {

}
