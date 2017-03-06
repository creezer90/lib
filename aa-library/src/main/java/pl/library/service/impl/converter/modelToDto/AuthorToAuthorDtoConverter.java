package pl.library.service.impl.converter.modelToDto;

import org.springframework.stereotype.Service;

import pl.library.DTO.AuthorDTO;
import pl.library.model.Author;
import pl.library.service.ObjectConverter;
import pl.library.util.DateUtil;

@Service
public class AuthorToAuthorDtoConverter implements ObjectConverter<Author, AuthorDTO> {

	@Override
	public AuthorDTO convert(Author model) {
		return AuthorDTO.builder()//
				.id(model.getId())//
				.name(model.getName())//
				.surname(model.getSurname())//
				.born(DateUtil.formatTo_Y_M_D_date(model.getBorn()))//
				.died(DateUtil.formatTo_Y_M_D_date(model.getDied()))//
				.books(model.getBooks()).build();
	}

}
