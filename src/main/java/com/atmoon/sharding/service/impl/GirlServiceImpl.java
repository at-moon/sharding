package com.atmoon.sharding.service.impl;

import com.atmoon.sharding.entity.Girl;
import com.atmoon.sharding.mapper.GirlMapper;
import com.atmoon.sharding.service.IGirlService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author at-moon
 * @since 2020-09-08
 */
@Service
public class GirlServiceImpl extends ServiceImpl<GirlMapper, Girl> implements IGirlService {

    @Resource
    private GirlMapper girlMapper;

    @Override
    @DS("sharding")
    public Girl getById(Long id) {
        return girlMapper.selectById(id);
    }

    @Override
    @DS("sharding")
    public int insert(Girl girl) {
        return girlMapper.insert(girl);
    }

    @Override
    @DS("sharding")
    public List<Girl> shardingList(String city) {
        QueryWrapper<Girl> wrapper = new QueryWrapper();
        wrapper.eq("city", city);
        return girlMapper.selectList(wrapper);
    }


}
