package de.hexad.mishralibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.hexad.mishralibrary.domain.Books;

public interface BookRepository extends JpaRepository<Books, Integer> {

	public Books findByBookNameAndAuthor(String bookName, String author);
}
