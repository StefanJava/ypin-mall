package com.stefan.ypinmall.ware;

import com.stefan.ypinmall.ware.entity.WareInfoEntity;
import com.stefan.ypinmall.ware.service.WareInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YpinWareApplicationTests {

	@Resource
	WareInfoService wareInfoService;

	@Test
	public void contextLoads() {
		WareInfoEntity wareInfoEntity = new WareInfoEntity();
		wareInfoEntity.setName("华南仓库");

		wareInfoService.save(wareInfoEntity);
		System.out.println("保存成功");
	}

}
