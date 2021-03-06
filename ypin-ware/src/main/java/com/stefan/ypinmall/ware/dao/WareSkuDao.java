package com.stefan.ypinmall.ware.dao;

import com.stefan.ypinmall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author Stefan_Yang
 * @email stefanyang520@gmail.com
 * @date 2020-06-01 12:47:04
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
