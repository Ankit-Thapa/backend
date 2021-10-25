package com.demoproject.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.demoproject.shopping.service.ImageService;
import com.demoproject.shopping.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ImageController {
	@Autowired
	private ImageService imageService;
	
	@PostMapping("/upload")
	public void uploadExcel(@RequestParam("file") MultipartFile file) {
		imageService.uploadToDb(file);
	}
}
