package com.theledgerco.model;

public class Payment {
    private double lump_sum;
    private int emi_no;

    public Payment(double lump_sum, int emi_no) {
        setLump_sum(lump_sum);
        setEmi_no(emi_no);
    }

    public double getLump_sum() {
        return lump_sum;
    }

    public void setLump_sum(double lump_sum) {
        this.lump_sum = lump_sum;
    }

    public int getEmi_no() {
        return emi_no;
    }

    public void setEmi_no(int emi_no) {
        this.emi_no = emi_no;
    }
}
