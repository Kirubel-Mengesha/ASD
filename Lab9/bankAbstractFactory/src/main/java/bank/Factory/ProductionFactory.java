package bank.Factory;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.integration.EmailSender;
import bank.integration.IEmailSender;

public class ProductionFactory implements MyFactory {
    public IAccountDAO getAccountDAO() {
        return new AccountDAO();
    }

    public IEmailSender getEmailSender() {
        return new EmailSender();
    }
}
