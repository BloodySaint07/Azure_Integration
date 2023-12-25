package com.example.GetTimeDate;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/gettime/api")
public class TimeController {

    @GetMapping("/time")
    public ResponseEntity<?> getTime(){
       return ResponseEntity.ok(LocalDateTime.now());
    }
    @GetMapping("/ping")
    public String ping(){
        return "Time Service Up!!!";
    }
}
