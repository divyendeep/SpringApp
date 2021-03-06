package github.io.somesh.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import github.io.somesh.app.message.MessagePublisher;

@RestController
public class TestController {
  
  private final MessagePublisher publisher;
  
  @Autowired
  public TestController(MessagePublisher publisher) {
    // TODO Auto-generated constructor stub
    this.publisher=publisher;
  }
  
	@GetMapping("/hello")
	public ResponseEntity welcome(){
		return ResponseEntity.ok("Welcome aboard");
	}
	
	@GetMapping("/publish/{message}")
	public void showList(@PathVariable String message){
		publisher.publish(message);		
	}
	
}
