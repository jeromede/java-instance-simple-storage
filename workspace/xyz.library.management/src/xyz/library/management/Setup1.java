package xyz.library.management;

import xyz.library.model.Book;
import xyz.library.model.Copy;
import xyz.library.model.Library;
import xyz.library.model.Loan;
import xyz.library.model.Person;

public class Setup1 {

	Library createLibrary() {
		Library chatillon = new Library();
		Person al = chatillon.addBorrower(new Person("Al", "0601030405"));
		Person bob = chatillon.addBorrower(new Person("Bob", "0606070809"));
		Book midsummer = chatillon.addBook(new Book("A Midsummer Night's Dream", new Person("William Shakespeare")));
		Book amisInconnus = chatillon.addBook(new Book("Les Amis inconnus", new Person("Jules Supervielle")));
		Copy _copy1 = chatillon.addCopy(new Copy(midsummer));
		Copy copy2 = chatillon.addCopy(new Copy(midsummer));
		Copy _copy3 = chatillon.addCopy(new Copy(midsummer));
		Copy copy4 = chatillon.addCopy(new Copy(amisInconnus));
		Copy copy5 = chatillon.addCopy(new Copy(amisInconnus));
		chatillon.addLoan(new Loan(copy2, bob));
		chatillon.addLoan(new Loan(copy4, bob)); // TODO: think about Bob borrowing twice the same book
		chatillon.addLoan(new Loan(copy5, al));
		return chatillon;
	}

}
