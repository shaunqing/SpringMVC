package com.shaun.service;

import java.util.List;

import com.shaun.entity.User;
import com.shaun.util.PageModel;

public interface UserService {

	public PageModel<User> getAll(int pageNo);
	
	public User getUserById(int userId);

	public List<User> getAllUser();

	public void deleteUser(int userId);
	
	public void updateUser(User user);

}
