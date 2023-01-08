package codetest;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProspectConverterTest {
    @Test
    public void prospectsConverterTest() {
        List<Loan> loans = ProspectsConverter.parseToLoans("src/test/resources/prospects_test.txt");

        assertEquals(loans.get(0).getCustomerName(), "Testname1 & Testname2");
    }
}
