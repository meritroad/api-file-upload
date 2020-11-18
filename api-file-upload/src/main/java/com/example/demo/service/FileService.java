package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Book;
import com.example.demo.util.CSVHelper;

@Service
public class FileService {

	public List<Book> parseFileAndGetBooks(MultipartFile file) {
		List<Book> books = null;
		try {
			books = CSVHelper.csvToBooks(file.getInputStream());
		} catch (IOException e) {
			throw new RuntimeException("fail to store csv data: " + e.getMessage());
		}

		return books;
	}
}
