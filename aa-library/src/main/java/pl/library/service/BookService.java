package pl.library.service;

import java.util.List;

import pl.library.model.Book;

public interface BookService {

	List<Book> findAllBooks();

	void saveBook(Book book);
	
	void removeBook(Long id);
}
