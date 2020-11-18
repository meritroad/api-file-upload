package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Book;
import com.example.demo.service.FileService;

@RequestMapping("/rest/upload")
@RestController
public class UploadFileResource {

	@Autowired
	private FileService fileService;

	@PostMapping("/file")
	public List<Book> upload(@RequestParam("file") MultipartFile file) {
		System.out.println("Processing new API Request ...");
		return fileService.parseFileAndGetBooks(file);
	}

}
