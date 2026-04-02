package com.aziz.ci_cd_start.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class Test {
    @GetMapping("/test")
    public String test(){
        return "Hello world v1 added integration on server ahahhahaaahhahhahahahah yahoooooooooo!!!";
    }

    @GetMapping("/oglan")
    public String redirectToPhoto() {
        return "redirect:/IMG_9620.JPG";
    }

}
