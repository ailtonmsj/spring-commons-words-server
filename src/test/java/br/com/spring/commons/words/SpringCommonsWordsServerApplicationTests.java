package br.com.spring.commons.words;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringCommonsWordsServerApplication.class)
@ActiveProfiles("local-test")
public class SpringCommonsWordsServerApplicationTests {

	@Test
	public void contextLoads() {
	}

}

