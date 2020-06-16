package main.java.com.mkaloshyn.behavioral.command_14;

public class DepositCommand implements Command {

    private BankAccount bankAccount;

    public DepositCommand(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void execute() {
        bankAccount.deposit();
    }
}
