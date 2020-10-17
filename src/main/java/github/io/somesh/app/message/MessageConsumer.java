package github.io.somesh.app.message;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
  
  @KafkaListener(topics = "sample-topic" ,id = "consumer-1")
  public void consumeMessage(String message) {
    System.out.println("Message Consumed is"+message);
  }
}
