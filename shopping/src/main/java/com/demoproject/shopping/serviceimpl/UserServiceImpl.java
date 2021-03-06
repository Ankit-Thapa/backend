package com.demoproject.shopping.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproject.shopping.repository.UserRepository;
import com.demoproject.shopping.service.UserService;
import com.demoproject.shopping.entity.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository UserRepository;
	
	
	@Override
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();  
		UserRepository.findAll().forEach(userData -> users.add(userData));  
		System.out.println(users);
		return users;
	}

	@Override
	public void saveUser(User user) {
		UserRepository.save(user);  
	}

	@Override
	public User getUserById(int id) {
		return UserRepository.findById(id).get(); 
	}
	
	@Override
	public void deleteUserById(int id) {
		UserRepository.deleteById(id);  
	}
}
