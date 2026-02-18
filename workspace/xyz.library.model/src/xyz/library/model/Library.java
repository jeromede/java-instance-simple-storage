package xyz.library.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	
	public void serialize(String filename) {
		try {
			FileOutputStream fileOut = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(this);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in " + filename);
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	public static Library deserialize(String filename) {
		try {
			Library library;
			FileInputStream fileIn = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			library = (Library) in.readObject();
			in.close();
			fileIn.close();
			return library;
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("Library class not found");
			c.printStackTrace();
		}
		return null;
	}


}
