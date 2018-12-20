package com.minshang.erp.model.foodlib.entity;

import com.minshang.erp.common.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @ClassName FoodLibEntity
 * @Description 菜品库实体类
 * @Author 后羿i
 * @Date 2018/12/20
 * @Version 1.0
 **/
@Data
@Entity
@Table(name = "tb_food_lib")
public class FoodLibEntity extends BaseEntity {
}