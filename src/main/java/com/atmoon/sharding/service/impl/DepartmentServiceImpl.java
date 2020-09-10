package com.atmoon.sharding.service.impl;

import com.atmoon.sharding.entity.Department;
import com.atmoon.sharding.mapper.DepartmentMapper;
import com.atmoon.sharding.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author at-moon
 * @since 2020-09-08
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
