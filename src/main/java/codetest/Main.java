package codetest;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

// Lets refer to prospects.txt and do the output with our Magic powers.
public class Main {

	public static void main(String[] args) {
		
// Helper comments:
// defined variables string=customerName, double=totalLoan, double=interestRate, int=totalYears		
// undefined variables double=monthRate, double=monthlyInterest, int=paymentNumber, double=totalPaidAmount		
// undefined = now defined!! :D

		List<Loan> loans = ProspectsConverter.parseToLoans("src/main/resources/prospects.txt");

		  System.out.println("\n		**********************************************************"
		  		+ "******************************************");

		  	for (int i = 0; i < loans.size(); i++) {

		  	System.out.println("\n		Prospect " + ( 1 + i ) + ": " + loans.get(i).getCustomerName() + " wants to"
		    		+ " borrow " + loans.get(i).getTotalLoan() + " € for a period of " + loans.get(i).getTotalYears() + " years"
		    		+ " and pay " + NumberFormat.getCurrencyInstance(Locale.GERMANY).format(loans.get(i).getMonthRate()) + " each month");
		    System.out.println("\n		**********************************************************"
		    		+ "******************************************");

		  	}

	}

}
