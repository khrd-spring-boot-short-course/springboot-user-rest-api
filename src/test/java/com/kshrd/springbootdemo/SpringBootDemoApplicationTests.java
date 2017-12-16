package com.kshrd.springbootdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kshrd.springbootdemo.repository.MybatisUserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {
	
	@Autowired
	MybatisUserRepository repo;
	
	@Test
	public void contextLoads() {
		repo.findAll().forEach(u->{
			System.out.println(u);
			System.out.println(u.getRoles());
		});
	}

}
