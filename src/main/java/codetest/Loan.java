package codetest;

public class Loan {

// Johnny Mnemonic v1995. 
// Movie reference "to hold the memory in the brain"
	
	// Helper comments:
	// undefined variables double=monthRate, double=monthlyInterest, int=paymentNumber, double=totalPaidAmount		
	
	// Calculations:		
	// monthlyInterest = (interestPercent/100) / 12
	//
	// paymentNumber = totalYears * 12
	//
	// totalPaidAmount = paymentNumber * monthRate
	//
	// monthRate = ( totalLoan * ((monthlyInterest * (1 + monthlyInterest) ** paymentNumber)) / 
	// ((1 + monthlyInterest) ** paymentNumber - 1)) )		

// define final variables set in reader/converter Object	
  private final String customerName;
  private final double totalLoan;
  private final double interestRate;
  private final int totalYears;
  
// Helper list of "undefined" missing variables that need getter.
//  private double monthRate;
//  private double monthlyInterest;
//  private int paymentNumber;
//  private double totalPaidAmount;
  
  	// Localise variables
    public Loan(String customerName, double totalLoan, double interestRate, int totalYears) {
      this.customerName = customerName;
      this.totalLoan = totalLoan;
      this.interestRate = interestRate;
      this.totalYears = totalYears;

    }

    	// Mnemonic Memory Files 
    	public String getCustomerName() {
    	  return customerName;
    	}
    	public double getTotalLoan() {
    	  return totalLoan;
    	}
    	public double getInterestRate() {
    	  return interestRate;
    	}
    	public int getTotalYears() {
    	  return totalYears;
    	}

    	// New variable Calculations aka Einstein Formulas

// For checking exponent Implementation
// power(double base, int exponent)
//
// Description: Use power then add parenthesis plus content for what you need as base 
// separated with a comma then exponent and end with parenthesis.

    	  // Get missing variables
    	  public double getMonthRate() {
    	    double monthRate = totalLoan * ( ( getMonthlyInterest() * power ( 1 + getMonthlyInterest() , getPaymentNumber() )) /
    	    		( power(1 + getMonthlyInterest(), getPaymentNumber()) - 1 ) );
    	    // Helper comments included in each method:
    	    // monthRate = ( totalLoan * ((monthlyInterest * (1 + monthlyInterest) ** paymentNumber)) / 
    	    // ((1 + monthlyInterest) ** paymentNumber - 1)) )	
    	    return monthRate;
    	  }

    	  public double getMonthlyInterest() {
    	    double monthlyInterest = (interestRate / 100) / 12;
    	    
    	    // monthlyInterest = ((interestPercent/100)/12)
    	    //	NOTE InterestPercent = double interestRate (Mnemonic)
    	    return monthlyInterest;
    	  }

    	  public int getPaymentNumber() {
    		int paymentNumber = ( totalYears * 12);

    		// paymentNumber = (totalYears * 12)
    		// Which means Amount of months each customer pays
    		return paymentNumber;
    	  }

    	  public double getTotalPaidAmount() {
    		double totalPaidAmount = (getPaymentNumber() * getMonthRate()) ;

    		// totalPaidAmount = paymentNumber * monthRate
    		// only added for checking total sum of paid amount for more accuracy if necessary
    		return totalPaidAmount;
    	  }

    	    // How to get the exponent since ** doesn't work?
    	    // Very weird code from the Depths of Internet Hell just to get the exponent
    	    static double power(double base, int exponent) {
    	      double power = 1;
    	      
    	      //increment the value of i after each iteration until the condition becomes false
    	      for (int i = 1; i <= exponent; i++)
    	        //calculates power
    	    	power = power * base;
    	      //returns power
    	      return power;
    	    }

// End of Johnny Mnemonic Movie.

}
