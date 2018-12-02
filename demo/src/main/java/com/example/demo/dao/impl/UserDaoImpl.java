package com.example.demo.dao.impl;

import org.springframework.stereotype.Component;

import com.example.demo.dao.UserDao;

@Component
public class UserDaoImpl implements UserDao {
	 @Override
	    public int addUser() {
	        System.out.println("add user ......");
	        return 6666;
	    }

	    @Override
	    public void updateUser() {
	        System.out.println("update user ......");
	    }

	    @Override
	    public void deleteUser() {
	        System.out.println("delete user ......");
	    }

	    @Override
	    public void findUser() {
	        System.out.println("find user ......");
	    }
}
