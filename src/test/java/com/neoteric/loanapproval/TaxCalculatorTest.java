package com.neoteric.loanapproval;

import com.neoteric.loanapproval.model2tax.ITR1;
import com.neoteric.loanapproval.model2tax.ITR2;
import com.neoteric.loanapproval.model2tax.ITR3;
import com.neoteric.loanapproval.model2tax.ITR4;
import com.neoteric.loanapproval.service2tax.TaxCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxCalculatorTest {


        @Test
        public void testCalculateTaxITR1() {
            TaxCalculator calculator = new TaxCalculator();
            ITR1 itr1 = new ITR1(500000, "Salaried");

            double expectedTax = 500000 * 0.10;
            double actualTax = calculator.calculateTax(itr1);

            Assertions.assertEquals(expectedTax, actualTax, 0.0);
        }

        @Test
        public void testCalculateTaxITR2() {
            TaxCalculator calculator = new TaxCalculator();
            ITR2 itr2 = new ITR2(500000, 200000, "Investor");

            double expectedTax = (500000 * 0.15) + (200000 * 0.20);
            double actualTax = calculator.calculateTax(itr2);

            Assertions.assertEquals(expectedTax, actualTax, 0.0);
        }

        @Test
        public void testCalculateTaxITR3() {
            TaxCalculator calculator = new TaxCalculator();
            ITR3 itr3 = new ITR3(500000, 200000, 300000, "Business Owner");

            double expectedTax = (500000 * 0.15) + (200000 * 0.20) + (300000 * 0.25);
            double actualTax = calculator.calculateTax(itr3);

            Assertions.assertEquals(expectedTax, actualTax, 0.0);
        }

        @Test
        public void testCalculateTaxITR4() {
            TaxCalculator calculator = new TaxCalculator();
            ITR4 itr4 = new ITR4(500000, 200000, 300000, 100000, "Freelancer");

            double expectedTax = (500000 * 0.15) + (200000 * 0.20) + (300000 * 0.25) + (100000 * 0.10);
            double actualTax = calculator.calculateTax(itr4);

            Assertions.assertEquals(expectedTax, actualTax, 0.0);
        }
}


