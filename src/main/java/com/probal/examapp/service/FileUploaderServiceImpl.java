package com.probal.examapp.service;

import com.probal.examapp.service.partials.IFileUploaderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


@Service
public class FileUploaderServiceImpl implements IFileUploaderService {

    @Value("${app.upload.dir:${user.home}}")
    private String uploadDir;


    @Override
    public void uploadFile(MultipartFile file) {
        try {
            Thread.sleep(3000);
            Path copyLocation = Paths
                    .get( uploadDir + File.separator + StringUtils.cleanPath(file.getOriginalFilename()));
            Files.copy(file.getInputStream(), copyLocation, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Could not store file " + file.getOriginalFilename()
                    + ". Please try again!");
        }
    }
}
