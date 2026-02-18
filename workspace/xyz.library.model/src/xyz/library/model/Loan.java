package xyz.library.model;

import java.time.LocalDateTime;

public class Loan implements java.io.Serializable {

	private static final long serialVersionUID = 6734251319639827083L;

	private Copy copy;
	private LocalDateTime date;
	private Person borrower;

	public Loan(Copy copy, Person borrower) {
		this.copy = copy;
		this.borrower = borrower;
		this.date = LocalDateTime.now();
	}

	public Copy getCopy() {
		return this.copy;
	}

	public Person getBorrower() {
		return this.borrower;
	}

	public LocalDateTime getDate() {
		return this.date;
	}

}
