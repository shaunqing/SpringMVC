package com.shaun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shaun.dao.UserDao;
import com.shaun.entity.User;
import com.shaun.service.UserService;
import com.shaun.util.PageModel;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	@Override
	public PageModel<User> getAll(int pageNo) {
		PageModel<User> pageModel = new PageModel<>();
		int rowIndex = (pageNo -  1) * PageModel.getPageSize();
		List<User> users = userDao.getAllPaging(rowIndex, PageModel.getPageSize());
		pageModel.setPageList(users);
		pageModel.setTotalRecords(userDao.getAllCount());
		return pageModel;
	}

	@Override
	public User getUserById(int userId) {
		return this.userDao.getById(userId);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllPaging(0, 2);
	}

	@Override
	public void deleteUser(int userId) {
		userDao.deleteUser(userId);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

}
