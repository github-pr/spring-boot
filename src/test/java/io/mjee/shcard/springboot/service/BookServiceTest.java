package io.mjee.shcard.springboot.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class BookServiceTest {
	
	@Autowired
	BookService bookservice;
	
	@Test
	public void testFindById() {
		Assertions.assertThrows(RuntimeException.class, ()->{
		long id = 1L;
		bookservice.findById(id)
				.orElseThrow(() -> new RuntimeException("Not found"));
		});			
	}
}
