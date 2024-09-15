package com.example.kafka.DeliveryMessagekafka.controller;

import com.example.kafka.DeliveryMessagekafka.service.KafkaSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic")
public class KafkaSenderController {

    @Autowired
    private KafkaSenderService kafkaSenderService;
    @PostMapping("update")
    public ResponseEntity<?> getTopicUpdate()
    {
        for(int i=1 ;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.kafkaSenderService.getupdate("Sending messages....."+i);
    }
        return ResponseEntity.ok("send..");
    }
}
