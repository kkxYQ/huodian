package com.itcast.service.impl;

import com.itcast.entity.Three;
import com.itcast.dao.ThreeMapper;
import com.itcast.service.IThreeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 表1 3主要参数的合理范围参考值 服务实现类
 * </p>
 *
 * @author huodian
 * @since 2019-11-07
 */
@Service
public class ThreeServiceImpl extends ServiceImpl<ThreeMapper, Three> implements IThreeService {

}
