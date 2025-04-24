package com.winksoftware.testgithubpush;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestGithubPushApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void failTest() {
		Assertions.fail("This is a failed test");
	}

}
