package com.gipsybuho.backend_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Backend NEMETERIAL funcionando correctamente - " + LocalDateTime.now());
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "¡Hola! El servidor está activo en puerto 8080";
    }
}