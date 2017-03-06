package pl.library.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import pl.library.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
