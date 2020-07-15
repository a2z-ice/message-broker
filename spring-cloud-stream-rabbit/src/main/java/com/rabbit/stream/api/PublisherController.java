package com.rabbit.stream.api;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {

	private MessageChannel messages;
	private MessageChannel otpMessage;

    public PublisherController(OutputBinding binding, OtpBinding otpBinding) {
    	messages = binding.channel();
    	otpMessage = otpBinding.channel();
    	
    }

    @PostMapping("/publish")
    public Book publishEvent(@RequestBody Book book) {
    	messages.send(MessageBuilder.withPayload(book).build());
    	otpMessage.send(MessageBuilder.withPayload(book).build());
        return book;
    }
}
