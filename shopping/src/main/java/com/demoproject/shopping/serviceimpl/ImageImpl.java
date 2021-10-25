package com.demoproject.shopping.serviceimpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.demoproject.shopping.entity.Image;
import com.demoproject.shopping.repository.ImageRepository;
import com.demoproject.shopping.service.ImageService;

@Service
public class ImageImpl implements ImageService{
	@Autowired
	private ImageRepository imageRepository;
	
	@Override
	public void uploadToDb(MultipartFile file) {
		System.out.println("filename Ankit"+file);
		Image image = new Image();
		try {
		
			image.setFileData(file.getBytes());
			image.setFileType(file.getContentType());
			image.setFileName(file.getOriginalFilename());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		imageRepository.save(image);
	}
}
