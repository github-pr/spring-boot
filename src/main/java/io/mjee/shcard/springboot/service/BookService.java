package io.mjee.shcard.springboot.service;

import java.util.Optional;

import io.mjee.shcard.springboot.domain.Book;

public interface BookService {
	
	Optional<Book> findById(Long id);
}
