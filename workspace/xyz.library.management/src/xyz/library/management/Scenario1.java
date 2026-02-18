package xyz.library.management;

import xyz.library.model.Library;

public class Scenario1 {

	public static void main(String[] args) {
		Library chatillon = Setup1.createLibrary();
		chatillon.serialize("chatillon.ser");
	}

}
