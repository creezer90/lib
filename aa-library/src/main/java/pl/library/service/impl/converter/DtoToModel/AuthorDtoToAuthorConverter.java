package pl.library.service.impl.converter.DtoToModel;


import pl.library.DTO.Author;
import pl.library.model.AuthorDTO;
import pl.library.service.ObjectConverter;

public class AuthorDtoToAuthorConverter implements ObjectConverter<AuthorDTO, Author> {

	@Override
	public Author convert(AuthorDTO dto) {
		return Author.builder()//
				.name(dto.getName())//
				.surname(dto.getSurname())//
				.born(dto.getBorn())//
				.died(dto.getDied())//
				.books(dto.getBooks()).build();
	}

}
