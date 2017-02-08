package pl.library.service.impl.converter.DtoToModel;

import pl.library.DTO.Book;
import pl.library.model.BookDTO;
import pl.library.service.ObjectConverter;

public class BookDtoToBookConverter implements ObjectConverter<BookDTO, Book> {

	@Override
	public Book convert(BookDTO dto) {
		return Book.builder()//
				.name(dto.getName())//
				.author(dto.getAuthor())//
				.published(dto.getPublished())//
				.isbn(dto.getIsbn()).build();
	}

}
