package com.shaun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shaun.entity.User;

public interface UserDao {

	/**
	 * 分页查询
	 * 
	 * @param start
	 *            要显示的第一条记录在表中的序号（从零开始）
	 * @param rows
	 *            显示多少条数据
	 * @return
	 */
	public List<User> getAllPaging(@Param("rowIndex") int rowIndex, @Param("rowNum") int rowNum);

	public int getAllCount();

	public User getById(int id);

	public List<User> getAll();

	public void insertUser(User user);

	public void updateUser(User user);

	public void deleteUser(int id);

}
