package com.itcast.dao;

import com.itcast.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 目录表 Mapper 接口
 * </p>
 *
 * @author huodian
 * @since 2019-11-08
 */
public interface CategoryMapper extends BaseMapper<Category> {

     //@Select(" SELECT * FROM t_category WHERE FIND_IN_SET(id, getChild(#{id}))")
    List<Category> findAll(Long id);

}
