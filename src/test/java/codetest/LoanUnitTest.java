package codetest;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoanUnitTest {
    @Test
    public void powerReturnsPower() {
        double base = 10;
        int exponent = 5;
        assertEquals( Loan.power (base, exponent), (100000));
    }
    @Test
    public void totalPaidAmountEqualsTotalLoanAndTotalInterest() {
        Loan myLoan = new Loan("Kalle Anka", 10000, 5, 20);
        assertEquals(NumberFormat.getCurrencyInstance(Locale.GERMANY).format(15838.94), NumberFormat.getCurrencyInstance(Locale.GERMANY).format(myLoan.getTotalPaidAmount()));
    }
    @Test
    public void calculatedMonthRateExampleEqualsLoanMonthRate() {
        Loan myLoan = new Loan("Kalle Anka", 10000, 5, 20);
        assertEquals(NumberFormat.getCurrencyInstance(Locale.GERMANY).format(66.00), NumberFormat.getCurrencyInstance(Locale.GERMANY).format(myLoan.getMonthRate()));
    }

}
