package com.godeltech.kafka.producer.producer.contoller;


import com.godeltech.kafka.producer.producer.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("api/transactions")
@RestController
public class TransactionController {

    @Autowired
    private KafkaTemplate<Long, Transaction> kafkaTemplate;

    @PostMapping
    public void sendOrder(@RequestBody Transaction msg){
        kafkaTemplate.send("transactions", Long.parseLong("1"), msg);
        System.out.println(msg);
    }

}

