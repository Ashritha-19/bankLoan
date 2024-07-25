package com.neoteric.loanapproval.model2tax;

public class ITR3 {

        private double income;
        private double capitalGains;
        private double businessIncome;
        private String profession;

        public ITR3(double income, double capitalGains, double businessIncome, String profession) {
            this.income = income;
            this.capitalGains = capitalGains;
            this.businessIncome = businessIncome;
            this.profession = profession;
        }

        public double getIncome() {
            return income;
        }

        public void setIncome(double income) {
            this.income = income;
        }

        public double getCapitalGains() {
            return capitalGains;
        }

        public void setCapitalGains(double capitalGains) {
            this.capitalGains = capitalGains;
        }

        public double getBusinessIncome() {
            return businessIncome;
        }

        public void setBusinessIncome(double businessIncome) {
            this.businessIncome = businessIncome;
        }

        public String getProfession() {
            return profession;
        }

        public void setProfession(String profession) {
            this.profession = profession;
        }
}


