package com.example.devops_backend1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SimpleController {
    
    @PostMapping("/demo")
    public ResponseEntity<?> demo(@RequestBody Demo demo) {
        String title = demo.getTitle() + " app is running!";
        System.out.println(title);
        demo.setTitle(title);
        return new ResponseEntity<>(demo, HttpStatus.OK);
    }
}
