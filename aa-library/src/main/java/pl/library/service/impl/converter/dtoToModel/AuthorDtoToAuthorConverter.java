package pl.library.service.impl.converter.dtoToModel;

import org.springframework.stereotype.Service;

import pl.library.DTO.AuthorDTO;
import pl.library.model.Author;
import pl.library.service.ObjectConverter;
import pl.library.util.DateUtil;

@Service
public class AuthorDtoToAuthorConverter implements ObjectConverter<AuthorDTO, Author> {

	@Override
	public Author convert(AuthorDTO dto) {
		return Author.builder()//
				.id(dto.getId())//
				.name(dto.getName())//
				.surname(dto.getSurname())//
				.born(DateUtil.parse_Y_M_D_date(dto.getBorn()))//
				.died(DateUtil.parse_Y_M_D_date(dto.getDied()))//
				.books(dto.getBooks()).build();
	}

}
