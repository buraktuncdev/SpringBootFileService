package com.buraktuncdev.filesystem;

import com.buraktuncdev.filesystem.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class FilesystemrestApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilesystemrestApplication.class, args);
    }

}
