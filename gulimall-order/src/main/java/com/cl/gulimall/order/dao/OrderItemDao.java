package com.cl.gulimall.order.dao;

import com.cl.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author chenlong
 * @email chenl@bupt.edu.cn
 * @date 2023-12-11 16:20:42
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
