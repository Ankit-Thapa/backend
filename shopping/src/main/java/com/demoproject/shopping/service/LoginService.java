package com.demoproject.shopping.service;

import java.util.HashMap;
import java.util.List;

import com.demoproject.shopping.entity.User;

public interface LoginService {
	public HashMap<String, String> loginAuth(String email,String password) ;
}
