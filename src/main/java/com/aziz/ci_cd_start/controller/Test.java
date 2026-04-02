package com.aziz.ci_cd_start.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class Test {
    @GetMapping("/test")
    public String test() {
        return "Hello world v1 added integration on server ahahhahaaahhahhahahahah yahoooooooooo!!!  oqlannnnnn";
    }


    @GetMapping("/oglan")
    public ResponseEntity<byte[]> photo(@RequestParam String ad) throws IOException {

        ClassPathResource imgFile ;
        switch (ad) {
            case "Aziz" -> imgFile = new ClassPathResource("static/IMG_9620.JPG");
            case "Ismayil" -> imgFile = new ClassPathResource("static/img.png");
            case "Nemet" -> imgFile = new ClassPathResource("static/img_1.png");
            default -> {
                imgFile = new ClassPathResource("static/hahaha.jpg");
                byte[] bytes = imgFile.getInputStream().readAllBytes();
                return ResponseEntity.ok()
                        .header("Content-Type", "image/jpeg").body(bytes);
            }
        }
        byte[] bytes = imgFile.getInputStream().readAllBytes();


        return ResponseEntity.ok()
                .header("Content-Type", "image/jpeg")
                .body(bytes);
    }
}