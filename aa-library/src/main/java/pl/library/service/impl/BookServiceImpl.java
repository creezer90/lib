package pl.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.library.model.Book;
import pl.library.repository.BookRepository;
import pl.library.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> findAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public void saveBook(Book book) {
		bookRepository.saveAndFlush(book);
	}

	@Override
	public void removeBook(Long id) {
		bookRepository.delete(id);
	}

}
