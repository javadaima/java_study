package com.example.study.service.impl;

import com.example.study.service.KafkaTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaTestServiceImpl implements KafkaTestService {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Override
    //@Transactional
    public void sendMessage(String message) {
        kafkaTemplate.send("tsct-app-log",message);
    }
}
