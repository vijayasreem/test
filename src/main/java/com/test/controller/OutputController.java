package com.test.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Output;
import com.test.service.OutputService;

@RestController
@RequestMapping("/endorsement-output")
public class OutputController {

    @Autowired
    OutputService outputService;

    @GetMapping
    public ResponseEntity<Object> generateEndorsementOutput(@RequestParam String endorsementNumber) {
        Output output = outputService.generateEndorsementOutput(endorsementNumber);
        if (output != null) {
            return new ResponseEntity<>(String.format("Generated Endorsement Number: %s, Timestamp: %s", output.getEndorsementNumber(), output.getTimestamp()), HttpStatus.OK);
        }
        return new ResponseEntity<>("Failed to generate endorsement output", HttpStatus.BAD_REQUEST);
    }

}