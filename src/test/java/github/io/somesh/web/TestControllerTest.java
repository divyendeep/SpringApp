package github.io.somesh.web;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(TestController.class)
@ExtendWith(SpringExtension.class)
public class TestControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void validateWelcomeResponse() throws Exception {
		//mvc.perform(GET())
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/hello");
		mvc.perform(builder).andExpect(MockMvcResultMatchers.status().isOk());
			
	}
	
	@Test
	public void validateShowListResponse() throws Exception {
		//mvc.perform(GET())
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/list");
		mvc.perform(builder).andExpect(MockMvcResultMatchers.status().isOk());
			
	}
	
	@Test
	public void inValidResponse() throws Exception {
		//mvc.perform(GET())
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/temp");
		mvc.perform(builder).andExpect(MockMvcResultMatchers.status().isNotFound());
			
	}
	
}
