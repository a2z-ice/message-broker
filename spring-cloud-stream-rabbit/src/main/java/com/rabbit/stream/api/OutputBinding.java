package com.rabbit.stream.api;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface OutputBinding {
    @Output("outputChannel")
    MessageChannel channel();
}
