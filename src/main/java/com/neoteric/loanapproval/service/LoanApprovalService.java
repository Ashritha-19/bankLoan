package com.neoteric.loanapproval.service;

import com.neoteric.loanapproval.model.LoanDetails;

public class LoanApprovalService {
    public LoanAmountService loanAmountService;
   // public LoanDetails loanDetails;
    public void getLoanApproval(int months ){

        double  emiPm=loanAmountService.loanDetail.totalAmount/months;
        if ( loanAmountService.balanceAmount < 0.6 * emiPm){
            System.out.println("eligble for loan");
        }else {
            System.out.println("not eligble for loan");
        }

    }
}
