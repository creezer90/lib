package pl.library.service.impl.converter.modelToDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.library.DTO.BookDTO;
import pl.library.model.Book;
import pl.library.service.ObjectConverter;

@Service
public class BookToBookDtoConverter implements ObjectConverter<Book, BookDTO> {

	@Autowired
	AuthorToAuthorDtoConverter authorConverter;

	@Override
	public BookDTO convert(Book model) {
		return BookDTO.builder()//
				.id(model.getId())//
				.title(model.getTitle())//
				.author(model.getAuthor())//
				// .authorId(model.getAuthor() != null ?
				// model.getAuthor().getId() : null)//
				.published(model.getPublished())//
				.isbn(model.getIsbn()).build();
	}

}
