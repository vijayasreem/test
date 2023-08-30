package com.test.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Output;
import com.test.repository.OutputRepository;

@Service
public class OutputService {

    @Autowired
    OutputRepository outputRepository;

    public Output generateEndorsementOutput(String endorsementNumber) {
        Output output = outputRepository.findByEndorsementNumber(endorsementNumber);
        if (output == null) {
            output = new Output();
            output.setEndorsementNumber(endorsementNumber);
            output.setTimestamp(LocalDateTime.now());
            return outputRepository.save(output);
        }
        return output;
    }
}