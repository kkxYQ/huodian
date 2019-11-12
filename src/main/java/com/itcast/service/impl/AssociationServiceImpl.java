package com.itcast.service.impl;

import com.itcast.entity.Association;
import com.itcast.dao.AssociationMapper;
import com.itcast.service.IAssociationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 表格关联表 服务实现类
 * </p>
 *
 * @author huodian
 * @since 2019-11-07
 */
@Service
public class AssociationServiceImpl extends ServiceImpl<AssociationMapper, Association> implements IAssociationService {

}
