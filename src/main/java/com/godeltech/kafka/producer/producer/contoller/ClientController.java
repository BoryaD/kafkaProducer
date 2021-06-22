package com.godeltech.kafka.producer.producer.contoller;


import com.godeltech.kafka.producer.producer.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("api/clients")
@RestController
public class ClientController {

    @Autowired
    private KafkaTemplate<Long, Client> kafkaTemplate;

    @PostMapping()
    public void sendOrder(@RequestBody Client msg){
        kafkaTemplate.send("clients", Long.parseLong("1"), msg);
        System.out.println(msg);
    }
}
