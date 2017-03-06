package pl.library.service;

import java.util.List;

import pl.library.DTO.AuthorDTO;
import pl.library.model.Author;

public interface AuthorService {

	List<Author> findAllAuthors();

	void add(Author author);

	Author findById(Long id);
}
