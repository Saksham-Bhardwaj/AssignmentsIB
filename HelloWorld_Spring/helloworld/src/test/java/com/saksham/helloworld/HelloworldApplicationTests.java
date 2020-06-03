package com.saksham.helloworld;

import com.saksham.helloworld.controller.HelloController;
import static  org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloworldApplicationTests {

	@Autowired
	private HelloController controller;

	private String testName="Test";

	@Test
	void contextLoads() throws Exception{
		assertThat(controller).isNotNull();
	}

	@Test
	void helloWorldTest() throws Exception{
		assert (controller.hello()).equals("Hello World");
	}

	@Test
	void helloUserTest() throws Exception{
		assert(controller.helloUser(this.testName)).equals("Hello "+this.testName);
	}

}
