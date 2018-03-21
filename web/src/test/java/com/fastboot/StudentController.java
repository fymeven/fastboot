package com.fastboot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentController {

	@Autowired
	protected WebApplicationContext wac;

	private MockMvc mockMvc;

	@Before
	public void before(){
		mockMvc= MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void page() throws Exception {
		String contentAsString = mockMvc.perform(MockMvcRequestBuilders
				.get("/student/page")
				.param("pageNo", "1")
				.param("pageSize", "2"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn().getResponse().getContentAsString();
		System.out.println(contentAsString);
	}

}
