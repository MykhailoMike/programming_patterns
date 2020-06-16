package main.java.com.mkaloshyn.behavioral.command_14;

public class AccountRunner {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        ATM atm = new ATM(
                new DepositCommand(bankAccount),
                new CashupCommand(bankAccount),
                new BalanceCommand(bankAccount)
        );
        atm.balanceAccount();
        atm.depositAccount();
        atm.cashupAccount();
    }
}
