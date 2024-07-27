package bank.command.impl;

import bank.command.Command;
import bank.service.AccountService;
import bank.service.IAccountService;


public class DepositCommand implements Command {

    private IAccountService accountService;
    private long accountnumber;
    private double amount;


    public DepositCommand(IAccountService accountService, long accountnumber, double amount) {
        this.accountService = accountService;
        this.accountnumber = accountnumber;
        this.amount = amount;
    }



    public void execute() {
        accountService.deposit(accountnumber, amount);
    }

    public void unExecute() {
        accountService.withdraw(accountnumber, amount);
    }

}
