package com.paris8.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProduitService {
	public static final String DOCUMENT_DIRECTORY = "D:/5eme annee/Theories/untitled/src/assets/image";
	
	public void uploadFile(MultipartFile file, String directory) throws IOException {
		Path filePath = Paths.get(directory  + File.separator + StringUtils.cleanPath(file.getOriginalFilename()));
		Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
	}
	
}

