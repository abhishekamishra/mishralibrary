package de.hexad.mishralibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.hexad.mishralibrary.domain.Users;
import de.hexad.mishralibrary.model.BookDTO;
import de.hexad.mishralibrary.model.UsersDTO;
import de.hexad.mishralibrary.service.BookService;

@RestController
@RequestMapping("/mishralibrary")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/home")
	public String getHome() {
		return "HOME";
	}

	@PostMapping(path = "/addBooks")
	// ,consumes = "application/json", produces = "application/json"
	public String addBooks(@RequestBody BookDTO bookDTO) {
		return bookService.addBook(bookDTO);
	}

	@PostMapping(path = "/borrowBooks")
	public String borrowBooks(@RequestBody List<BookDTO> bookDTOList) {
		UsersDTO usersDTO = new UsersDTO();
		return bookService.borrowBooks(bookDTOList,usersDTO);
	}
}
