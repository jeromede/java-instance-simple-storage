package xyz.library.management;

import xyz.library.model.Library;
import xyz.library.model.Person;

public class Setup1 {

	Library createLibrary() {
		Library chatillon = new Library();
		Person al = chatillon.addBorrower(new Person("Al", "0601030405"));
		Person bob = chatillon.addBorrower(new Person("Bob", "0606070809"));
		return chatillon;
	}

}
