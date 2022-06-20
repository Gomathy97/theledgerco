package com.theledgerco;

import com.theledgerco.helper.Constants;
import com.theledgerco.helper.Pair;
import com.theledgerco.model.Payment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runApplication(args);
    }

    private static void runApplication(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis);
            Map<Pair, Borrower> nameVsLoan = new HashMap<>();
            while (sc.hasNextLine()) {
                String[] input = sc.nextLine().split(" ");
                String command = input[0];
                Pair pair = new Pair(input[2], input[1]);
                Borrower borrower;
                switch (command) {
                    case Constants.LOAN:
                        nameVsLoan.put(pair, new Borrower(pair.getBorrower_name(), pair.getBank_name(), Double.parseDouble(input[3]),
                                Integer.parseInt(input[4]), Integer.parseInt(input[5])));
                        break;
                    case Constants.PAYMENT:
                        borrower = nameVsLoan.get(pair);
                        borrower.setPayment(new Payment(Long.parseLong(input[3]), Integer.parseInt(input[4])));
                        break;
                    case Constants.BALANCE:
                        borrower = nameVsLoan.get(pair);
                        borrower.calculateBalance(Integer.parseInt(input[3]));
                        borrower.printBalance();
                        break;
                }
            }
            sc.close(); // closes the scanner
        } catch (IOException ignored) {
        }
    }
}
