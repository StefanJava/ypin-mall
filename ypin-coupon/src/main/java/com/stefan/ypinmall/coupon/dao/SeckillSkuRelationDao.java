package com.stefan.ypinmall.coupon.dao;

import com.stefan.ypinmall.coupon.entity.SeckillSkuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 * 
 * @author Stefan_Yang
 * @email stefanyang520@gmail.com
 * @date 2020-06-01 12:29:23
 */
@Mapper
public interface SeckillSkuRelationDao extends BaseMapper<SeckillSkuRelationEntity> {
	
}
