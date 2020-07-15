package com.cloude.stream.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface OtpInputBinding {

    String MESSAGES = "otpInputChannel";

    @Input(MESSAGES)
    SubscribableChannel channel();
}
