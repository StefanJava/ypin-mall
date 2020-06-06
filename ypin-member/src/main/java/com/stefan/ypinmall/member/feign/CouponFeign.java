package com.stefan.ypinmall.member.feign;

import com.stefan.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author StefanYang
 * @description
 * @date 2020-06-01 16:43
 */
@FeignClient("ypin-coupon")
public interface CouponFeign {

	@GetMapping("/coupon/coupon/member/list")
	R memberCoupons();

}
