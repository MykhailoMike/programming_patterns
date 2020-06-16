package main.java.com.mkaloshyn.behavioral.command_14;

public class ATM {

    private Command deposit;
    private Command cashup;
    private Command balance;

    public ATM(Command deposit, Command cashup, Command balance) {
        this.deposit = deposit;
        this.cashup = cashup;
        this.balance = balance;
    }

    public void depositAccount() {
        deposit.execute();
    }

    public void cashupAccount() {
        cashup.execute();
    }

    public void balanceAccount() {
        balance.execute();
    }
}
