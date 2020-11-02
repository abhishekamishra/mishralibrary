package de.hexad.mishralibrary.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class BookDTO implements Serializable{

	private int id;
	private String bookName;
	private String author;
	private Date createdDate;
	private Date modifiedDate;
	private UsersDTO usersDTO;
	private List<BookDTO> bookDTOList;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public UsersDTO getUsersDTO() {
		return usersDTO;
	}
	public void setUsersDTO(UsersDTO usersDTO) {
		this.usersDTO = usersDTO;
	}
	public List<BookDTO> getBookDTOList() {
		return bookDTOList;
	}
	public void setBookDTOList(List<BookDTO> bookDTOList) {
		this.bookDTOList = bookDTOList;
	}
//	public UsersDto getUserId() {
//		return userId;
//	}
//	public void setUserId(UsersDto userId) {
//		this.userId = userId;
//	}
}
