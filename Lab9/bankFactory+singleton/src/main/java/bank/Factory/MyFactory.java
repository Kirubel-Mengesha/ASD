package bank.Factory;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.integration.EmailSender;
import bank.integration.IEmailSender;

public interface MyFactory {
    public IAccountDAO getAccountDAO();
    public IEmailSender getEmailSender();

}