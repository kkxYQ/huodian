package com.itcast.controller;


import com.itcast.entity.Category;
import com.itcast.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 省份编码表 前端控制器
 * </p>
 *
 * @author huodian
 * @since 2019-11-08
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @RequestMapping("/findAll")
    public List<Category> findAll(){
        return categoryService.findAll(1L);
    }

}
