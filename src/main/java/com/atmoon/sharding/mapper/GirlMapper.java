package com.atmoon.sharding.mapper;

import com.atmoon.sharding.entity.Girl;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author at-moon
 * @since 2020-09-08
 */
public interface GirlMapper extends BaseMapper<Girl> {

    /**
     * @param city
     * @return
     */
    List<Girl> queryGirlByCity(@Param("city") String city);
}
