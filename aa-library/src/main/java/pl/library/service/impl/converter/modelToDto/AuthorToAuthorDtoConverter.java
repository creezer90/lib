package pl.library.service.impl.converter.modelToDto;


import pl.library.DTO.Author;
import pl.library.model.AuthorDTO;
import pl.library.service.ObjectConverter;

public class AuthorToAuthorDtoConverter implements ObjectConverter<AuthorDTO, Author> {

	@Override
	public Author convert(AuthorDTO model) {
		return Author.builder()//
				.name(model.getName())//
				.surname(model.getSurname())//
				.born(model.getBorn())//
				.died(model.getDied())//
				.books(model.getBooks()).build();
	}

}
