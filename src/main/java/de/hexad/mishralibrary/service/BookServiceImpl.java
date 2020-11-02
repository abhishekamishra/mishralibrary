package de.hexad.mishralibrary.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.hexad.mishralibrary.domain.AssignedBooks;
import de.hexad.mishralibrary.domain.Books;
import de.hexad.mishralibrary.model.BookDTO;
import de.hexad.mishralibrary.model.UsersDTO;
import de.hexad.mishralibrary.repository.AssignedBooksRepository;
import de.hexad.mishralibrary.repository.BookRepository;
import de.hexad.mishralibrary.util.ModelToDomain;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private AssignedBooksRepository assignedBooksRepository;

	private String result;

	@Override
	public String addBook(BookDTO bookDTO) {

		Books bookData = bookRepository.saveAndFlush(ModelToDomain.BookDTOModelToBooksDomain(bookDTO));

		if (bookData != null) {
			return "Book is added to library.";
		}
		return "Book is not added to library.";
	}

	@Override
	public String borrowBooks(List<BookDTO> bookDTOList, UsersDTO usersDTO) {

		for (Iterator iterator = bookDTOList.iterator(); iterator.hasNext();) {
			BookDTO bookDTO = (BookDTO) iterator.next();
			System.out.println(bookDTO.getBookName() + " " + bookDTO.getId());

			// Checks as the required book is available in database or not
			Books books = bookRepository.findByBookNameAndAuthor(bookDTO.getBookName(), bookDTO.getAuthor());

			if (books != null) {
				// checks the number of books assigned to user
				List<AssignedBooks> assignedBooks = assignedBooksRepository.findByUserIdAndBookId(usersDTO.getUserId(),
						bookDTO.getId());

				// If assigned books limit is 2
				if (assignedBooks.size() > 2) {
					result = "User has already borrowed 2 books";
				} else {
					// If a book is already assigned to the user
					if (!assignedBooks.isEmpty()) {
						if (assignedBooks.get(1).getUserId().getUserId() == usersDTO.getUserId()
								&& assignedBooks.get(1).getBookId().getId() == bookDTO.getId()) {
							assignedBooksRepository.saveAndFlush(assignedBooks.get(0));
						} else {
							result = "'" + assignedBooks.get(1).getBookId().getBookName() + "' is already borrowed by "
									+ assignedBooks.get(1).getUserId().getUserName() + "";
						}
					} else {
						// If there's no books assigned to user
						assignedBooksRepository.saveAll(assignedBooks);
					}
				}

			} else {
				// If book is not available in the library
				result = "'" + bookDTO.getBookName() + "' book is not available in the Library.";
			}
		}
		return result;
	}

}
