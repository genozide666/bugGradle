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
		  
//		  System.out.println("Customer Centric Bank Money Bin Inc."
//			       + "\nLocation Duckburg"
//			       + "\n");
		  System.out.println("\n		**********************************************************"
		  		+ "******************************************");

		  	for (int i = 0; i < loans.size(); i++) {

		  	System.out.println("\n		Prospect " + ( 1 + i ) + ": " + loans.get(i).getCustomerName() + " wants to"
		    		+ " borrow " + loans.get(i).getTotalLoan() + " € for a period of " + loans.get(i).getTotalYears() + " years"
		    		+ " and pay " + NumberFormat.getCurrencyInstance(Locale.GERMANY).format(loans.get(i).getMonthRate()) + " each month");
		    System.out.println("\n		**********************************************************"
		    		+ "******************************************");

		  	}
		  	  
		  	
//		  System.out.println("\nClose program to exit. If you wish to edit the Prospects please update the text file named Prospects. "
//					   	   + "\nThank You for using Money Bin Inc services.");		
			
		
//	System.out.println("\nFirst customer detail test:"
//			+ "\nCustomerName: " + loans.get(0).getCustomerName() + ""
//			+ "\nTotal Loan: " + loans.get(0).getTotalLoan() + ""
//			+ "\nInterestRate in percent: " + loans.get(0).getInterestRate() + ""
//			+ "\nTotal Years: " + loans.get(0).getTotalYears() + ""
//			+ "\nTotal Paid Amount: " + loans.get(0).getTotalPaidAmount() + ""
//			+ "\nMonthRate Raw value: " + loans.get(0).getMonthRate() + ""); 
		
	}

}
