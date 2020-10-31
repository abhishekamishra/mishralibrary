package de.hexad.mishralibrary.model;

import java.sql.Date;

public class BookDTO {

	private int id;
	private String bookName;
	private String author;
	private Date createdDate;
	private Date modifiedDate;
	private UsersDto userId;
	
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
	public UsersDto getUserId() {
		return userId;
	}
	public void setUserId(UsersDto userId) {
		this.userId = userId;
	}
}
