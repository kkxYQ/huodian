package com.itcast.service.impl;

import com.itcast.entity.One;
import com.itcast.dao.OneMapper;
import com.itcast.service.IOneService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 表1 1主要工作进程表 服务实现类
 * </p>
 *
 * @author huodian
 * @since 2019-11-07
 */
@Service
public class OneServiceImpl extends ServiceImpl<OneMapper, One> implements IOneService {

}
