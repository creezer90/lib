package pl.library.service.impl.converter.modelToDto;

import pl.library.DTO.Book;
import pl.library.model.BookDTO;
import pl.library.service.ObjectConverter;

public class BookToBookDtoConverter implements ObjectConverter<BookDTO, Book> {

	@Override
	public Book convert(BookDTO model) {
		return Book.builder()//
				.name(model.getName())//
				.author(model.getAuthor())//
				.published(model.getPublished())//
				.isbn(model.getIsbn()).build();
	}

}
