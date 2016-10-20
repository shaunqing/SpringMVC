package com.shaun.service;

import java.util.List;

import com.shaun.entity.User;

public interface UserService {

	public User getUserById(int userId);

	public List<User> getAllUser();

	public void deleteUser(int userId);

}
