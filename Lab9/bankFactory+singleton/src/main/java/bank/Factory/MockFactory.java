package bank.Factory;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.dao.MockAccountDAO;
import bank.integration.EmailSender;
import bank.integration.IEmailSender;
import bank.integration.MockEmailSender;

public class MockFactory implements MyFactory {
    public IAccountDAO getAccountDAO() {
        return new MockAccountDAO();
    }

    public IEmailSender getEmailSender() {
        return new MockEmailSender();
    }

}
