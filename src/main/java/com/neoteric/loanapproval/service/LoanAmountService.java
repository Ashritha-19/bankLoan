package com.neoteric.loanapproval.service;

import com.neoteric.loanapproval.model.LoanApplication;
import com.neoteric.loanapproval.model.LoanDetails;

public class LoanAmountService {
    //public double loanAmount;
     public double balanceAmount;
     public LoanDetails loanDetail;

    public LoanDetails getLoanAmount(LoanApplication loanApplication){
          balanceAmount=(loanApplication.salaryInfo.salaryLpa/12)-loanApplication.salaryInfo.expenses;
         LoanDetails loanDetails = new LoanDetails();
      loanDetails.loanAmount=balanceAmount*10;
      loanDetails.interestRate=0.07;
      loanDetails.totalAmount=loanDetails.loanAmount*loanDetails.interestRate;
        System.out.println(loanDetails.totalAmount);
      return loanDetails;
    }
}
