package io.mjee.shcard.springboot.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import io.mjee.shcard.springboot.domain.Book;
import io.mjee.shcard.springboot.domain.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	private final BookRepository bookRepository;
	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	
	@Override
	public Optional<Book> findById(Long id) {
		return bookRepository.findById(id);
	}

}
