package com.shaun.dao;

import java.util.List;

import com.shaun.entity.User;

public interface UserDao {

	public User getById(int id);

	public List<User> getAll();

	public void insertUser(User user);

	public void updateUser(User user);

	public void deleteUser(int id);
}
