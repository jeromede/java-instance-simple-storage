package xyz.library.model;

public class Book implements java.io.Serializable {

	private static final long serialVersionUID = 6098098613441198215L;

	private String title;
	private Person author;
	// private String isbn;
	// etc. (date, keywords)

	public Book(String title, Person author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return this.title;
	}

	public Person getAuthor() {
		return this.author;
	}

}
