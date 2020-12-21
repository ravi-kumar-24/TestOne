package com.he.interest;

import java.util.Arrays;

public class SavingAccount extends BankAccount {

    private Double amount;
    private Double rateOfInterest;
    private Transaction transaction;

    public SavingAccount(Double amount, Double rate, Transaction... transactions) {
        super(amount, rate, Arrays.asList(transactions));

        this.amount = amount;
        this.rateOfInterest = rate;
    }

    @Override
    public Double getInterest(Integer duration) {
        // TODO
        Transaction transaction = new Transaction(this.amount);
       // return (Double) this.amount * Math.pow((1+ this.rateOfInterest/12), duration) - this.amount;

        double total = this.amount  * Math.pow(1 + (this.rateOfInterest/ 12), 12 * duration);
        return total - this.amount;
    }

}
