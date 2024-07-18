package com.neoteric.loanapproval.service;

import com.neoteric.loanapproval.model.LoanApplication;

import java.util.UUID;

public class ApplicationService {
    public LoanApplication getApplication(LoanApplication loanApplication){
        if ( (loanApplication.salaryInfo.salaryLpa/12)>15000) {
            loanApplication.applicationNo= UUID.randomUUID().toString();
        }
        System.out.println(loanApplication.applicationNo);
        return loanApplication;
    }
}
