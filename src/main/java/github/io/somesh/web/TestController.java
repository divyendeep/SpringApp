package github.io.somesh.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/hello")
	public ResponseEntity welcome(){
		return ResponseEntity.ok("Welcome aboard");
	}
	
	@GetMapping("/list")
	public ResponseEntity showList(){
		List list=new ArrayList<String>();
		list.add("Hi");
		return ResponseEntity.ok().body(list);
	}
	
}
