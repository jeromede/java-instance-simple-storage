package xyz.library.model;

import java.time.LocalDateTime;

public class Loan implements java.io.Serializable {

	private static final long serialVersionUID = 6734251319639827083L;

	private Book book;
	private LocalDateTime date;
	private Person borrower;

	Loan(Book book, Person borrower) {
		this.book = book;
		this.borrower = borrower;
		this.date = LocalDateTime.now();
	}

	public Book getBook() {
		return this.book;
	}

	public LocalDateTime getDate() {
		return this.date;
	}

	public Person getBorrower() {
		return this.borrower;
	}

}
