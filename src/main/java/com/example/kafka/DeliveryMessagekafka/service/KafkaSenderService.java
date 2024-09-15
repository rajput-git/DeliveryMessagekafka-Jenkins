package com.example.kafka.DeliveryMessagekafka.service;

import com.example.kafka.DeliveryMessagekafka.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSenderService {

    @Autowired
   private  KafkaTemplate<String,String>  kafkaTemplate;

    private Logger logger= LoggerFactory.getLogger(KafkaSenderService.class);
    public boolean getupdate(String updateInfo)
    {

        this.kafkaTemplate.send(Constants.TOPIC_NAME,updateInfo);
        logger.info("calling....");
        return true;
    }

}
