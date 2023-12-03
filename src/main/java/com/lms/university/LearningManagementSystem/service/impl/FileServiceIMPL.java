package com.lms.university.LearningManagementSystem.service.impl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceIMPL {


    @Autowired
    private ResourceLoader resourceLoader;

    public void uploadFile(MultipartFile file) throws IOException {

        File file1 = new File(
                resourceLoader.getResource("D:\\Programmig Files\\SpringBoot\\Learning-Management-System\\src\\main\\resources\\store/").getFile() + "/" + file.getOriginalFilename());
        if (file1.createNewFile()) {
            System.out.println("File is created!" + file1.getAbsolutePath());

        } else {
            System.out.println("File already exists.");
        }

        BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(file1));
        stream.write(file.getBytes());
        stream.close();
    }

    public Resource downloadFile(String fileName) throws Exception {

        final Resource fileResource = resourceLoader.getResource("classpath:store/" + fileName);
        return fileResource;
    }
}
