package com.demo.mq.rabbit;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;
    /*simple*/
    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }

    /*topic*/
    public void send1() {
    	String context = "hi, i am message 1";
    	System.out.println("Sender : " + context);
    	this.rabbitTemplate.convertAndSend("exchange", "topic.message", context);
    }
    /*topic*/
    public void send2() {
    	String context = "hi, i am messages 2";
    	System.out.println("Sender : " + context);
    	this.rabbitTemplate.convertAndSend("exchange", "topic.messages", context);
    }
    /*fanout*/
    public void send3() {
		String context = "hi, fanout msg ";
		System.out.println("Sender : " + context);
		this.rabbitTemplate.convertAndSend("fanoutExchange","", context);
}
}