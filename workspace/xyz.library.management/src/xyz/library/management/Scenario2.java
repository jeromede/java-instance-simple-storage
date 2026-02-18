package xyz.library.management;

import java.io.File;

import xyz.library.model.Library;

public class Scenario2 {

	public static void main(String[] args) {
		String filename = "chatillon.ser";
		Library chatillon = Library.deserialize(filename);
		cleanup(filename);
		Check2.traceLibrary(chatillon);
	}
	
	public static void cleanup(String filename) {
		new File(filename).delete();		
	}

}
