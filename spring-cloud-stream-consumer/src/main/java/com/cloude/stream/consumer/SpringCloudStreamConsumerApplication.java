package com.cloude.stream.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableBinding({InputBinding.class,OtpInputBinding.class})
public class SpringCloudStreamConsumerApplication {
    private Logger logger = LoggerFactory.getLogger(SpringCloudStreamConsumerApplication.class);

    @StreamListener(target = InputBinding.MESSAGES)
    public void consumeMessage(Book book) {
        logger.info("Consume payload : " + book + " current thread:" + Thread.currentThread().getName());
    }
  
    @StreamListener(target = OtpInputBinding.MESSAGES)
    public void opt(Book book) {
        logger.info("OTP payload : " + book + " current thread:" + Thread.currentThread().getName());
    }   
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStreamConsumerApplication.class, args);
    }

}
