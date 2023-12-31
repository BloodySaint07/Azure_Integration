package com.example.GetTimeDate;


//import org.apache.logging.log4j.LogManager;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/gettime/api")
public class TimeController {

    // SLF4j
    // Logger logger= LoggerFactory.getLogger(TimeController.class);
    //Lg4j
    // Logger logger= LogManager.getLogger(TimeController.class);

    private static final Logger logger = LoggerFactory.getLogger(TimeController.class);

    @GetMapping("/time")
    public ResponseEntity<?> getTime() {
        logger.info("*** /gettime/api/time *** called in TimeController class ");

        return ResponseEntity.ok(LocalDateTime.now());
    }

    @GetMapping("/ping")
    public String ping() {
        return "Time Service Up!!!";
    }
}
