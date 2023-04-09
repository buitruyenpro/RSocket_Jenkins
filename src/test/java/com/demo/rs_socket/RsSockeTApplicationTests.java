package com.demo.rs_socket;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RsSockeTApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("run......................");
	}
	@Test
	void testAddition() {
		int a = 5;
		int b = 10;
		assertEquals(15, a + b);
	}

	@Test
	void testStringLength() {
		String str = "Hello, World!";
		assertEquals(13, str.length());
	}

	@Test
	void testArraySize() {
		int[] arr = {1, 2, 3, 4, 5};
		assertEquals(5, arr.length);
	}

}
