package br.com.spring.commons.words.controller;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "words=foo,bar,baz")
@AutoConfigureMockMvc
@ActiveProfiles("local-test")
public class WordsControllerTest {

	@Autowired
	MockMvc mockMvc;

//	@Test
//	public void words() throws Exception {
//		mockMvc.perform(get("/"))//
//				.andExpect(jsonPath("$.word", anyOf(is("foo"), is("bar"), is("baz"))));
//	}

}
