package de.hexad.mishralibrary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import de.hexad.mishralibrary.domain.AssignedBooks;

public interface AssignedBooksRepository extends JpaRepository<AssignedBooks, Integer>{

	public List<AssignedBooks> findByUserIdAndBookId(int userId, int bookId);
}
