package com.stefan.ypinmall.order;

import com.stefan.ypinmall.order.entity.OrderEntity;
import com.stefan.ypinmall.order.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YpinOrderApplicationTests {

	@Resource
	OrderService orderService;

	@Test
	public void contextLoads() {
		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setOrderSn("37476498394");
		orderService.save(orderEntity);
		System.out.println("保存成功");
	}

}
