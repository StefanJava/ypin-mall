package com.stefan.ypinmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stefan.common.utils.PageUtils;
import com.stefan.ypinmall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author Stefan_Yang
 * @email stefanyang520@gmail.com
 * @date 2020-05-31 22:51:52
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

