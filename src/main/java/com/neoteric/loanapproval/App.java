package com.neoteric.loanapproval;

import com.neoteric.loanapproval.model.*;
import com.neoteric.loanapproval.service.ApplicationService;
import com.neoteric.loanapproval.service.LoanAmountService;
import com.neoteric.loanapproval.service.LoanApprovalService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationService applicationService =new ApplicationService();
        LoanApplication loanApplication = new LoanApplication();
        Address address = new Address();
        address.city="HYD";
        address.flatNo="123";
        address.pincode="5656";
        address.state="TG";

        PersonalDetails personalDetails = new PersonalDetails();
        personalDetails.fullName="DINESH";
        personalDetails.dob="12/12/12";
        personalDetails.adharNo="13467";
        personalDetails.mailId="asdfgh@asdfg";
        personalDetails.phoneNo="98765432";
        personalDetails.panNo="dig11234kj";

        SalaryInfo salaryInfo = new SalaryInfo();
        salaryInfo.salaryLpa=500000;
        salaryInfo.expenses=15000;

        loanApplication.salaryInfo=salaryInfo;
        loanApplication.address=address;
        loanApplication.personalDetails=personalDetails;
        applicationService.getApplication(loanApplication);

        LoanAmountService loanAmountService = new LoanAmountService();
        LoanDetails loanDetails = loanAmountService.getLoanAmount(loanApplication);

        LoanApprovalService loanApprovalService = new LoanApprovalService(loanAmountService);
        loanApprovalService.getLoanApproval(loanDetails, 12);
    }
}
