package com.neoteric.loanapproval.model2tax;

public class ITR2 {

        private double income;
        private double capitalGains;
        private String profession;

        public ITR2(double income, double capitalGains, String profession) {
            this.income = income;
            this.capitalGains = capitalGains;
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

        public String getProfession() {
            return profession;
        }

        public void setProfession(String profession) {
            this.profession = profession;
        }
}


