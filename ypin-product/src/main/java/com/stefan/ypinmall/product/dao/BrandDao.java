package com.stefan.ypinmall.product.dao;

import com.stefan.ypinmall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author Stefan_Yang
 * @email stefanyang520@gmail.com
 * @date 2020-05-31 22:51:52
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
