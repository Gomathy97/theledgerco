package com.theledgerco.helper;

import java.util.Objects;

public class Pair {
    private String borrower_name;
    private String bank_name;
    public Pair(String borrower_name, String bank_name) {
        setBorrower_name(borrower_name);
        setBank_name(bank_name);
    }

    public String getBorrower_name() {
        return borrower_name;
    }

    public void setBorrower_name(String borrower_name) {
        this.borrower_name = borrower_name;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return borrower_name.equals(pair.borrower_name) && bank_name.equals(pair.bank_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(borrower_name, bank_name);
    }
}
