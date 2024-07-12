package com.scaler.Splitwise.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SettleUpController {
    @GetMapping("/hello") // GET call -> localhost:8080/hello
    public ResponseEntity helloWorld() {
        return ResponseEntity.ok("Hello World");
    }
}

//GET PUT POST DELETE