package com.exmple.demo.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.exmple.demo.model.User;

public interface SpringReadFileService {
	
	List<User> findAll();

	boolean saveDataFromUploadfile(MultipartFile file);

}
