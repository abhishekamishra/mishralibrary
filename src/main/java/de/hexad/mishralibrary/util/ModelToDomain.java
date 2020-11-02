package de.hexad.mishralibrary.util;

import de.hexad.mishralibrary.domain.Books;
import de.hexad.mishralibrary.model.BookDTO;

public class ModelToDomain {

	public static Books BookDTOModelToBooksDomain(BookDTO bookDTO) {
		Books books = new Books();
		books.setId(bookDTO != null ? bookDTO.getId() : null);
		books.setBookName(bookDTO != null ? bookDTO.getBookName() : null);
		books.setAuthor(bookDTO != null ? bookDTO.getAuthor() : null);
//		books.setUserId(bookDTO != null ? new Users(bookDTO.getUserId().getUserId()) : null);
		return books;
	}
	
}
