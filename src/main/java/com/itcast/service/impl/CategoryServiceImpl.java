package com.itcast.service.impl;

import com.itcast.entity.Category;
import com.itcast.dao.CategoryMapper;
import com.itcast.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 省份编码表 服务实现类
 * </p>
 *
 * @author huodian
 * @since 2019-11-08
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> findAll(Long id) {
        return categoryMapper.findAll(id);
    }
}
