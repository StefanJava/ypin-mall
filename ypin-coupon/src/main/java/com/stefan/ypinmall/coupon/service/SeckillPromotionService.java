package com.stefan.ypinmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stefan.common.utils.PageUtils;
import com.stefan.ypinmall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author Stefan_Yang
 * @email stefanyang520@gmail.com
 * @date 2020-06-01 12:29:23
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

