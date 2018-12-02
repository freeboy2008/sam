package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.UserDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
    UserDao userDao;
	@Test
	public void contextLoads() {
		userDao.addUser();
		userDao.updateUser();
		userDao.findUser();
		userDao.deleteUser();
		
	}

}
