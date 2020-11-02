package de.hexad.mishralibrary.service;

import java.util.List;

import de.hexad.mishralibrary.model.BookDTO;
import de.hexad.mishralibrary.model.UsersDTO;

public interface BookService {

	public String addBook(BookDTO bookDTO);
	
	public String borrowBooks(List<BookDTO> bookDTOList, UsersDTO usersDTO);
}
