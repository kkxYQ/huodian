package com.itcast.service;

import com.itcast.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 省份编码表 服务类
 * </p>
 *
 * @author huodian
 * @since 2019-11-08
 */
public interface ICategoryService extends IService<Category> {
    List<Category> findAll(Long id);

}
