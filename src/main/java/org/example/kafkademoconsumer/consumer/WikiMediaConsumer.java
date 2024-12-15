package org.example.kafkademoconsumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikiMediaConsumer {
    @KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
    public void consume(String msg) {
        log.info(String.format("Consumed message: %s", msg.toString()));
    }
}
