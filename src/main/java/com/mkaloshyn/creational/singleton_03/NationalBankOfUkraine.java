package main.java.com.mkaloshyn.creational.singleton_03;

import java.time.LocalDateTime;

public class NationalBankOfUkraine {

    private static NationalBankOfUkraine nbu;
    private static Long treasureBalance = 65_000_000_000L;
    private static StringBuilder accountingBook = new StringBuilder("The accounting book of " +
            "National Bank of Ukraine \n\n");

    private NationalBankOfUkraine() {
    }

    public static synchronized NationalBankOfUkraine getNbu() {
        if (nbu == null) {
            nbu = new NationalBankOfUkraine();
        }
        return nbu;
    }

    public void lend(String bankName, long amount) {
        if (amount <= treasureBalance) {
            treasureBalance -= amount;
            accountingBook.append("National Bank of Ukraine lent to " + bankName + "(UAH): " +
                    amount + " (" + LocalDateTime.now() + ")\n");
        } else {
            throw new RuntimeException("There is not enough money to lend it");
        }
    }

    public void readAccountingBook() {
        System.out.println(accountingBook);
    }
}
