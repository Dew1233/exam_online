package com.yegol.exam_online.service.impl;

import com.yegol.exam_online.entity.Menu;
import com.yegol.exam_online.mapper.MenuMapper;
import com.yegol.exam_online.service.MenuService;
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
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Menu> getAll() {
        return menuMapper.selectList(null);
    }
}
