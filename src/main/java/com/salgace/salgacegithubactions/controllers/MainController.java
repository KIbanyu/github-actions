package com.salgace.salgacegithubactions.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Itotia Kibanyu on 08 Feb, 2023
 */
@RestController
@Slf4j
@RequestMapping(value = "/api/vi")
public class MainController {

    @GetMapping("/greetings")
    public ResponseEntity<?> greetings(){
        log.info("INCOMING REQUESTS FOR GREETINGS");
        return new ResponseEntity<>("Good morning", HttpStatus.OK);
    }


}
