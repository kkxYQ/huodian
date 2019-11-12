package com.itcast.service.impl;

import com.itcast.entity.Four;
import com.itcast.dao.FourMapper;
import com.itcast.service.IFourService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 表1 4主要参数的合理相关性参考值 服务实现类
 * </p>
 *
 * @author huodian
 * @since 2019-11-07
 */
@Service
public class FourServiceImpl extends ServiceImpl<FourMapper, Four> implements IFourService {

}
