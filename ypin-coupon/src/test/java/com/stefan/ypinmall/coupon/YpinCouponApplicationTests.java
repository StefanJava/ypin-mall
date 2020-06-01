package com.stefan.ypinmall.coupon;

import com.stefan.ypinmall.coupon.entity.CouponEntity;
import com.stefan.ypinmall.coupon.service.CouponService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YpinCouponApplicationTests {

	@Resource
	CouponService couponService;

	@Test
	public void contextLoads() {
		CouponEntity couponEntity = new CouponEntity();
		couponEntity.setAmount(BigDecimal.valueOf(45));

		couponService.save(couponEntity);
		System.out.println("保存成功...");
	}

}
