package codetest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// This Program will read prospects.txt and convert it for use in Loan.java.

public class ProspectsConverter {

public static List<Loan> parseToLoans(String filepath) {
	
	List<Loan> customerList = new ArrayList<>();
	
	try {
	  BufferedReader reader = new BufferedReader(new FileReader(filepath));
	  String customerLine;
	  reader.readLine(); // to skip first line, header, in prospects textfile
		
	    while((customerLine = reader.readLine()) != null) {
		  if (customerLine.split(",").length > 4) {
			  customerLine = customerLine.replaceFirst(","," & ");
			  customerLine = customerLine.replace("\"", "");
		  	  }

		  // My first ever String object created, YAY! :D
		  String[] customerLinesplit = customerLine.split(",");
		  // Create Set Size of each customerLine, ignore wrong size. 
		  // Note! User must always input CORRECT AMOUNT OF VALUES as
		  // stated in title of prospects.txt
			if (customerLinesplit.length != 4) {
			  continue;
			}		  
			Loan myLoan = new Loan(customerLinesplit[0].trim(),Double.parseDouble(customerLinesplit[1].trim()),
Double.parseDouble(customerLinesplit[2].trim()),Integer.parseInt(customerLinesplit[3].trim()));

			customerList.add(myLoan);

		}
		
		reader.close();
		
		}	catch (IOException e) {
			e.printStackTrace();
            }
	
	return customerList;

  }

}