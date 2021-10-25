package com.demoproject.shopping.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.demoproject.shopping.dto.UserDTO;
import com.demoproject.shopping.entity.User;

public class UserModelMapper {
	ModelMapper modelMapper = new ModelMapper();
	@Autowired
	private User user;
	UserDTO userDTO = modelMapper.map(user, UserDTO.class);
}
