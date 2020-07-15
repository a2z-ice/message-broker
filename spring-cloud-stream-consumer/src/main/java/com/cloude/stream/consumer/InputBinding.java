package com.cloude.stream.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface InputBinding {

    String MESSAGES = "inputChannel";

    @Input(MESSAGES)
    SubscribableChannel channel();
}
