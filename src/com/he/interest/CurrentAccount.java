package com.he.interest;

import java.util.Arrays;
import java.util.List;

public class CurrentAccount extends BankAccount {

    private Double amount;
    private Double rateOfInterest;
    private Transaction transaction;

    public CurrentAccount(Double amount, Double rate, Transaction... transactions) {
        super(amount, rate, Arrays.asList(transactions));

        this.amount = amount;
        this.rateOfInterest = rate;
    }

    @Override
    public Double getInterest(Integer duration) {
        // TODO
        Transaction transaction = new Transaction(this.amount);
        return (Double) this.amount * Math.pow((1+ (this.rateOfInterest)/4), (4)*duration) - this.amount;
        //return null;
    }

}
