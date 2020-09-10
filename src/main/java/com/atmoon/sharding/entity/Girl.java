package com.atmoon.sharding.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author at-moon
 * @since 2020-09-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Girl implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 城市
     */
    private String city;

    private Double money;


}
