package com.demoproject.shopping.serviceimpl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproject.shopping.entity.User;
import com.demoproject.shopping.repository.UserRepository;
import com.demoproject.shopping.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserRepository UserRepository;
	
	@Override
	public HashMap<String, String> loginAuth(String email,String password) {
		User detail=UserRepository.findByEmail(email);
		String authEmail=detail.getEmail();
		String authPassword=detail.getPassword();
		String role=detail.getUserType();
		String id=Long.toString(detail.getId());
		
		HashMap<String, String> map = new HashMap<>();
	    map.put("role", role);
	    map.put("id",id);
		if(authEmail.equalsIgnoreCase(email) && authPassword.equals(password)) {
			map.put("status", "true");
		}
		else {
			map.put("status", "false");
		}
		return map;
	}

}
