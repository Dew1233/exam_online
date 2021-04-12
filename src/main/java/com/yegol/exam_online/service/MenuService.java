package com.yegol.exam_online.service;

import com.yegol.exam_online.entity.Menu;
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
public interface MenuService extends IService<Menu> {

    List<Menu> getAll();
}
