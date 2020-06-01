package com.stefan.ypinmall.order.dao;

import com.stefan.ypinmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author Stefan_Yang
 * @email stefanyang520@gmail.com
 * @date 2020-06-01 11:19:48
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
