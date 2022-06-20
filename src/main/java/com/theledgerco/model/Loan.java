package com.theledgerco.model;

public class Loan {
    private double pricipal;
    private int no_of_years;
    private int rate_of_interest;
    private double amount;
    private long emi_per_month;
    private int total_emi_months;
    private static final double PERCENT = 0.01;
    private static final int NO_OF_MONTHS = 12;

    public Loan(double pricipal, int no_of_years, int rate_of_interest) {
        setPricipal(pricipal);
        setNo_of_years(no_of_years);
        setRate_of_interest(rate_of_interest);
        calculateTotalAmount();
        calculateEmiPerMonth();
        calculateTotalEmiMonths();
    }

    private void calculateTotalEmiMonths() {
        setTotal_emi_months((int) Math.ceil(getAmount() / getEmi_per_month()));
    }

    private void calculateEmiPerMonth() {
        setEmi_per_month((long)Math.ceil(getAmount() / (NO_OF_MONTHS * getNo_of_years())));
    }

    private void calculateTotalAmount() {
        setAmount(getPricipal() + (getPricipal() * getNo_of_years() * getRate_of_interest() * PERCENT));
    }

    public int getTotal_emi_months() {
        return total_emi_months;
    }

    public void setTotal_emi_months(int total_emi_months) {
        this.total_emi_months = total_emi_months;
    }

    public long getEmi_per_month() {
        return emi_per_month;
    }

    public void setEmi_per_month(long emi_per_month) {
        this.emi_per_month = emi_per_month;
    }

    public double getPricipal() {
        return pricipal;
    }

    public void setPricipal(double pricipal) {
        this.pricipal = pricipal;
    }

    public int getNo_of_years() {
        return no_of_years;
    }

    public void setNo_of_years(int no_of_years) {
        this.no_of_years = no_of_years;
    }

    public int getRate_of_interest() {
        return rate_of_interest;
    }

    public void setRate_of_interest(int rate_of_interest) {
        this.rate_of_interest = rate_of_interest;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = Math.ceil(amount);
    }
}
