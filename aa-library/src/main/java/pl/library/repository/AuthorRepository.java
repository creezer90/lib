package pl.library.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pl.library.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

	@Query("SELECT distinct a from Author a WHERE a.id = :id")
	Author findById(@Param("id") Long id);
}
