package pl.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.library.DTO.AuthorDTO;
import pl.library.model.Author;
import pl.library.repository.AuthorRepository;
import pl.library.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	AuthorRepository authorRepository;

	@Override
	public List<Author> findAllAuthors() {
		return authorRepository.findAll();
	}

	@Override
	public void add(Author author) {
		authorRepository.saveAndFlush(author);
	}

	@Override
	public Author findById(Long id) {
		return authorRepository.findById(id);
	}

}
