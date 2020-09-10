package com.atmoon.sharding.service;

import com.atmoon.sharding.entity.Girl;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author at-moon
 * @since 2020-09-08
 */
public interface IGirlService extends IService<Girl> {

    /**
     * 根据id获取
     *
     * @param id
     * @return
     */
    Girl getById(Long id);

    /**
     * 返回分库数据
     *
     * @return
     */
    int insert(Girl girl);

    /**
     * 获取所有库中匹配数据
     *
     * @param city
     * @return
     */
    List<Girl> shardingList(String city);
}
