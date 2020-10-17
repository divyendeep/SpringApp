package github.io.somesh.app.message;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

public class TestMessageConsumer {
  /*private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;
  
  @InjectMocks
  private MessageConsumer consumer;
  
  @BeforeEach
  public void setUpStreams() {
      System.setOut(new PrintStream(outContent));
      
  }
  @AfterEach
  public void restoreStreams() {
      System.setOut(originalOut);
      
  }
  @Test
  public void testConsume() {
    consumer.consumeMessage("sampleMessage");
    assertEquals("Message Consumed issampleMessage\n", outContent.toString());
  }
  */
}
