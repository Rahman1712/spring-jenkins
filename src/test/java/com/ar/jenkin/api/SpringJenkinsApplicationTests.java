package com.ar.jenkin.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	public static Logger logger  = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	
	@Test
	public voids contextLoads() {
		logger.info("Test case  executing....");
		logger.info("Test case  executing second log statement....");
		logger.info("Test case  executing Adding for pipeline checking....");
		assertEquals(true, true);
	}

}
