package xyz.library.management;

import xyz.library.model.Library;
import xyz.library.model.Loan;

public class Check2 {

	public static void traceLibrary(Library chatillon) {

		for (Loan loan : chatillon.getLoans()) {
			System.out.println(loan.getBorrower().getName() + " has borrowed \"" + loan.getCopy().getBook().getTitle()
					+ "\" by " + loan.getCopy().getBook().getAuthor().getName() + " on " + loan.getDate());
		}
	}

}
