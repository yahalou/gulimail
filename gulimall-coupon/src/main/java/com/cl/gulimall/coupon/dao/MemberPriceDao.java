package com.cl.gulimall.coupon.dao;

import com.cl.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author chenlong
 * @email chenl@bupt.edu.cn
 * @date 2023-12-11 15:59:30
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
