package com.theledgerco.model;

public class Balance {
    private long amount_paid;
    private int emi_no;

    public Balance(long amount_paid, int emi_no) {
        setAmount_paid(amount_paid);
        setEmi_no(emi_no);
    }

    public long getAmount_paid() {
        return amount_paid;
    }

    public void setAmount_paid(long amount_paid) {
        this.amount_paid = amount_paid;
    }

    public int getEmi_no() {
        return emi_no;
    }

    public void setEmi_no(int emi_no) {
        this.emi_no = emi_no;
    }
}
