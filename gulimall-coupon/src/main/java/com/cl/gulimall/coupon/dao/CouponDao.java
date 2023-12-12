package com.cl.gulimall.coupon.dao;

import com.cl.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenlong
 * @email chenl@bupt.edu.cn
 * @date 2023-12-11 15:59:30
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
