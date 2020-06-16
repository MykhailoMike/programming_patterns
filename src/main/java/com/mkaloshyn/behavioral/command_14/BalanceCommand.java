package main.java.com.mkaloshyn.behavioral.command_14;

public class BalanceCommand implements Command {

    private BankAccount bankAccount;

    public BalanceCommand(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void execute() {
        bankAccount.balance();
    }
}
