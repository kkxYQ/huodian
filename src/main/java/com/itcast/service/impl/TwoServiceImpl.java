package com.itcast.service.impl;

import com.itcast.entity.Two;
import com.itcast.dao.TwoMapper;
import com.itcast.service.ITwoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 表1 2厂址观测站使用仪器一览表 服务实现类
 * </p>
 *
 * @author huodian
 * @since 2019-11-07
 */
@Service
public class TwoServiceImpl extends ServiceImpl<TwoMapper, Two> implements ITwoService {

}
