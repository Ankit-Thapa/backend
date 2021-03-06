package com.demoproject.shopping.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.demoproject.shopping.dto.UserDTO;
import com.demoproject.shopping.entity.User;
import com.demoproject.shopping.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Usercontroller {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	private List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/users")  
	private ResponseEntity<String> saveUser(@RequestBody User user)   
	{  
		String msg="Successfully Uploaded " +user;
		HttpHeaders header=new HttpHeaders();
		header.add("post status", "successful post");
		userService.saveUser(user);   
		return new ResponseEntity<String>(msg,header,HttpStatus.OK);
	}  
	
	@GetMapping("/users/{id}")  
	private ResponseEntity<User> getUser(@PathVariable("id") int id)   
	{  
		User body=userService.getUserById(id);  
		HttpHeaders header = new HttpHeaders();
		return ResponseEntity.status(HttpStatus.OK).headers(header).body(body);
	}
	
	@DeleteMapping("/users/{id}")  
	private String deleteUser(@PathVariable("id") int id)   
	{  
		userService.deleteUserById(id);  
		return "record deleted with id " +id;
	}
}
