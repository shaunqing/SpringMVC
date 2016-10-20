package com.shaun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shaun.dao.UserDao;
import com.shaun.entity.User;
import com.shaun.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	@Override
	public User getUserById(int userId) {
		return this.userDao.getById(userId);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAll();
	}

	@Override
	public void deleteUser(int userId) {
		userDao.deleteUser(userId);
	}

}
