package pl.library.service.impl.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.library.command.NewBookCommand;
import pl.library.model.Book;
import pl.library.service.AuthorService;
import pl.library.service.ObjectConverter;

@Service
public class NewBookCommandToBookConverter implements ObjectConverter<NewBookCommand, Book> {

	@Autowired
	AuthorService authorService;

	@Override
	public Book convert(NewBookCommand model) {
		return Book.builder()//
				.id(model.getId())//
				.title(model.getTitle())//
				.author(authorService.findById(model.getAuthorId()))//
				.published(model.getPublished())//
				.isbn(model.getIsbn())//
				.build();

	}

}
