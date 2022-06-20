package com.theledgerco;

import com.theledgerco.model.Balance;
import com.theledgerco.model.Loan;
import com.theledgerco.model.Payment;

public class Borrower {
    private String name;
    private String bank;
    private Loan loan;
    private Payment payment;
    private Balance balance;

    public Borrower() {}

    public Borrower(String name, String bank, double principal, int no_of_years, int rate_of_interest) {
        setName(name);
        setBank(bank);
        setLoan(new Loan(principal, no_of_years, rate_of_interest));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public void calculateBalance(int emi_no) {
        Payment payment_done = getPayment();
        Loan loan = getLoan();
        double amount_paid = 0.0;
        long emi_per_month = loan.getEmi_per_month();
        if(payment_done != null && emi_no >= payment_done.getEmi_no() && payment_done.getLump_sum() >= loan.getEmi_per_month()) {
            amount_paid = payment_done.getLump_sum();
        }
        amount_paid = Math.min(amount_paid + (emi_no * emi_per_month), loan.getAmount());
        int emi_remaining = (int) Math.ceil((loan.getAmount() - amount_paid)  / loan.getEmi_per_month());

        setBalance(new Balance((long)Math.ceil(amount_paid), emi_remaining));
    }

    public void printBalance() {
        System.out.println(getBank() + " " + getName() + " " + getBalance().getAmount_paid() + " " + getBalance().getEmi_no());
    }
}
