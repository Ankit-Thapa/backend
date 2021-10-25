package com.demoproject.shopping.service;

import java.util.List;

import com.demoproject.shopping.entity.User;

public interface UserService {
	public List<User> getAllUsers();
	public void saveUser(User user);
	public User getUserById(int id) ;
	public void deleteUserById(int id) ;
}
