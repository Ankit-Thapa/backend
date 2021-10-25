package com.demoproject.shopping.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
	public void uploadToDb(MultipartFile file) ;
}
