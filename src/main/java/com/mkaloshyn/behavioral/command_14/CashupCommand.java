package main.java.com.mkaloshyn.behavioral.command_14;

public class CashupCommand implements Command {

    private BankAccount bankAccount;

    public CashupCommand(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void execute() {
        bankAccount.cashUp();
    }
}
