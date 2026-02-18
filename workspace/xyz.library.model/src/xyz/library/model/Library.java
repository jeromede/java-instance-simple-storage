package xyz.library.model;

import java.util.HashSet;
import java.util.Set;

public class Library implements java.io.Serializable {

	private static final long serialVersionUID = -6334166679036411297L;

	private HashSet<Book> books = new HashSet<Book>();
	private HashSet<Copy> copies = new HashSet<Copy>();
	private HashSet<Person> borrowers = new HashSet<Person>();
	private HashSet<Loan> loans = new HashSet<Loan>();

	public Set<Book> addBook(Book book) {
		this.books.add(book);
		return this.books;

	}

	public Set<Copy> addBook(Copy copy) {
		this.copies.add(copy);
		return this.copies;

	}

	public Set<Person> addBorrower(Person person) {
		this.borrowers.add(person);
		return this.borrowers;

	}

	public Set<Loan> addLoan(Loan loan) {
		this.loans.add(loan);
		return this.loans;

	}

}
