package de.hexad.mishralibrary.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="assigned_books")
public class AssignedBooks {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="book_id")
	private Books bookId;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private Users userId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Books getBookId() {
		return bookId;
	}

	public void setBookId(Books bookId) {
		this.bookId = bookId;
	}

	public Users getUserId() {
		return userId;
	}

	public void setUserId(Users userId) {
		this.userId = userId;
	}

	public AssignedBooks() {
		super();
	}

	public AssignedBooks(Books bookId) {
		super();
		this.bookId = bookId;
	}

	public AssignedBooks(Users userId) {
		super();
		this.userId = userId;
	}
	
}
