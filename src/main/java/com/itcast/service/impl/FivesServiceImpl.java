package com.itcast.service.impl;

import com.itcast.entity.Fives;
import com.itcast.dao.FivesMapper;
import com.itcast.service.IFivesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 表1 5主要参数的合理变化参考值 服务实现类
 * </p>
 *
 * @author huodian
 * @since 2019-11-07
 */
@Service
public class FivesServiceImpl extends ServiceImpl<FivesMapper, Fives> implements IFivesService {

}
