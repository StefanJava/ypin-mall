package com.stefan.ypinmall.member;

import com.stefan.ypinmall.member.entity.MemberEntity;
import com.stefan.ypinmall.member.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YpinMemberApplicationTests {

	@Resource
	MemberService memberService;
	@Test
	public void contextLoads() {

		MemberEntity memberEntity = new MemberEntity();
		memberEntity.setUsername("stefan");

		memberService.save(memberEntity);
		System.out.println("保存成功");
	}

}
