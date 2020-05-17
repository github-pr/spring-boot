package io.mjee.shcard.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.mjee.shcard.springboot.domain.Book;
import io.mjee.shcard.springboot.service.BookService;

@RestController
@RequestMapping(value="/books")
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/{bookId}")
	public ResponseEntity findById(@PathVariable Long bookId){
		
		Book book = bookService.findById(bookId)
				.orElseThrow(()->new RuntimeException("Not found: " + bookId));
		return ResponseEntity.ok(book); // HTTP ENTITY STATUS Normal:200
	}
	
	
}
