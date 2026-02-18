package xyz.library.model;

import java.time.LocalDateTime;

public class Copy  implements java.io.Serializable {

	private static final long serialVersionUID = 6734251319639827083L;
	
	private Book book;
	private LocalDateTime dateOfAcquisition;

	public Copy(Book book) {
		this.book = book;
		this.dateOfAcquisition = LocalDateTime.now();
	}

	public Book getBook() {
		return this.book;
	}

	public LocalDateTime getDateOfAcquisition() {
		return this.dateOfAcquisition;
	}


}
