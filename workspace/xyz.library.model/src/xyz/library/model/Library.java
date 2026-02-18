package xyz.library.model;

import java.util.HashSet;
import java.util.Set;

public class Library implements java.io.Serializable {

	private static final long serialVersionUID = -6334166679036411297L;

	private HashSet<Book> books = new HashSet<Book>();
	private HashSet<Copy> copies = new HashSet<Copy>();
	private HashSet<Person> borrowers = new HashSet<Person>();
	private HashSet<Loan> loans = new HashSet<Loan>();

	public Book addBook(Book book) {
		this.books.add(book);
		return book;
	}

	public Copy addCopy(Copy copy) {
		this.copies.add(copy);
		return copy;
	}

	public Person addBorrower(Person person) {
		this.borrowers.add(person);
		return person;
	}

	public Loan addLoan(Loan loan) {
		this.loans.add(loan);
		return loan;
	}

	public Set<Book> getBooks() {
		return this.books;
	}

	public Set<Copy> getCopies() {
		return this.copies;
	}

	public Set<Person> getBorrower() {
		return this.borrowers;
	}

	public Set<Loan> getLoans() {
		return this.loans;
	}

}
