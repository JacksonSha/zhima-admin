package com.stang.tang.zhima.mapper;

import java.util.List;

import com.stang.tang.zhima.entity.User;

public interface UserMapper {

	public void createUser(User user);

	public User getUserById(int id);

	public List<User> getAllUsers();

	public int getUsersNum();

}
