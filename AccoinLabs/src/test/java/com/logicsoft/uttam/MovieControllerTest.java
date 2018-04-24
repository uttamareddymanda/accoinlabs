package com.logicsoft.uttam;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;



@RunWith(SpringRunner.class)
@WebMvcTest(value = AccoinLabsApplication.class, secure = false)
public class MovieControllerTest {

	@Autowired
	private MockMvc mockMvc;

	

	Movie movie = new Movie("Black Panther",
			Arrays.asList("Chadwick Boseman",
					""),120);


	@Test
	public void addMovie() throws Exception {

		

		RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/movies",movie).accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		assertEquals("Movie not added", "", result.getResponse().getContentAsString());
		
	}
	

}

