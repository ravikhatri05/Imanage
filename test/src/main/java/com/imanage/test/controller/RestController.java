package com.imanage.test.controller;

import com.imanage.test.model.Entry;
import com.imanage.test.service.StackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class RestController {

    @Autowired
    StackService stackService;

    @PostMapping("/")
    public ResponseEntity<Integer> push(@RequestBody Entry entry){
        return ResponseEntity.ok(stackService.push(entry.getData()));
    }

    @GetMapping("/")
    public ResponseEntity<Integer> peek(){
        return ResponseEntity.ok(stackService.peek());
    }

    @DeleteMapping("/")
    public ResponseEntity<Integer> pop(){
        return ResponseEntity.ok(stackService.pop());
    }
}
