package com.example.demo.config;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
public class ArquivoStorageProperties {
    @org.springframework.beans.factory.annotation.Value("${arquivo.uploadDir}")
    private String UploadDir;
}
