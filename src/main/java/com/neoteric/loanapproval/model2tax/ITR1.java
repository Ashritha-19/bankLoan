package com.neoteric.loanapproval.model2tax;

public class ITR1 {

        private double income;
        private String profession;

        public ITR1(double income, String profession) {
            this.income = income;
            this.profession = profession;
        }

        public double getIncome() {
            return income;
        }

        public void setIncome(double income) {
            this.income = income;
        }

        public String getProfession() {
            return profession;
        }

        public void setProfession(String profession) {
            this.profession = profession;
        }
}


