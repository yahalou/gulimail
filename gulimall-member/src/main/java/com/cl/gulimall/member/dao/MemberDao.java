package com.cl.gulimall.member.dao;

import com.cl.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenlong
 * @email chenl@bupt.edu.cn
 * @date 2023-12-11 16:08:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
