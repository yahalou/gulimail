package com.cl.gulimall.ware.dao;

import com.cl.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author chenlong
 * @email chenl@bupt.edu.cn
 * @date 2023-12-11 16:26:51
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
