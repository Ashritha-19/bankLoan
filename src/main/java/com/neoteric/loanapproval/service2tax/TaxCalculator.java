package com.neoteric.loanapproval.service2tax;

import com.neoteric.loanapproval.model2tax.ITR1;
import com.neoteric.loanapproval.model2tax.ITR2;
import com.neoteric.loanapproval.model2tax.ITR3;
import com.neoteric.loanapproval.model2tax.ITR4;

public class TaxCalculator {

    public double calculateTax(ITR1 itr) {

        return itr.getIncome() * 0.10;
    }


    public double calculateTax(ITR2 itr) {

        return (itr.getIncome() * 0.15) + (itr.getCapitalGains() * 0.20);
    }


    public double calculateTax(ITR3 itr) {

        return (itr.getIncome() * 0.15) + (itr.getCapitalGains() * 0.20) + (itr.getBusinessIncome() * 0.25);
    }


    public double calculateTax(ITR4 itr) {

        return (itr.getIncome() * 0.15) + (itr.getCapitalGains() * 0.20) + (itr.getBusinessIncome() * 0.25) + (itr.getOtherIncome() * 0.10);
    }
}
