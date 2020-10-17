package github.io.somesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

/**
 * Main SpringApp APplication.
 * 
 * @author sombose
 */
@Slf4j
@SpringBootApplication
public class SpringAppApplication {
  
  /**
   * main method of SpringApp.
   * 
   * @param args
   */
  public static void main(String[] args) {
    SpringApplication.run(SpringAppApplication.class, args);
  }

}
