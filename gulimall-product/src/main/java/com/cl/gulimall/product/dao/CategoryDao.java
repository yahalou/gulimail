package com.cl.gulimall.product.dao;

import com.cl.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenlong
 * @email chenl@bupt.edu.cn
 * @date 2023-12-11 14:11:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
