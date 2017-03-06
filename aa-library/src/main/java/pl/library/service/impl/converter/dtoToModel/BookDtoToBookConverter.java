package pl.library.service.impl.converter.dtoToModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.library.DTO.BookDTO;
import pl.library.model.Book;
import pl.library.service.ObjectConverter;

@Service
public class BookDtoToBookConverter implements ObjectConverter<BookDTO, Book> {

	@Autowired
	AuthorDtoToAuthorConverter authorConverter;

	@Override
	public Book convert(BookDTO dto) {
		return Book.builder()//
				.id(dto.getId())//
				.title(dto.getTitle())//
				.author(null)//
				.published(dto.getPublished())//
				.isbn(dto.getIsbn()).build();
	}

}
