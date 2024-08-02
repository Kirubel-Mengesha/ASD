package bank.service;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;

import bank.adapter.AccountAdapter;
import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;
import bank.dto.AccountDTO;
import bank.proxies.Logger;
import bank.proxies.Timer;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;

	
	public AccountService(){
		accountDAO=new AccountDAO();
		ClassLoader cl = IAccountDAO.class.getClassLoader();
		IAccountDAO loggeraccountDAO = (IAccountDAO) Proxy.newProxyInstance(cl, new Class[] { IAccountDAO.class }, new Logger(accountDAO));
		accountDAO = (IAccountDAO) Proxy.newProxyInstance(cl, new Class[] { IAccountDAO.class }, new Timer(loggeraccountDAO));
	}

	public AccountDTO createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		accountDAO.saveAccount(account);
		AccountDTO accountDTO = AccountAdapter.getAccountDto(account);
		return accountDTO;

	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		accountDAO.updateAccount(account);
	}

	public AccountDTO getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		AccountDTO accountDTO = AccountAdapter.getAccountDto(account);
		return accountDTO;
	}

	public Collection<AccountDTO> getAllAccounts() {
		Collection<Account> accounts = accountDAO.getAccounts();
		Collection<AccountDTO> accountDTOs = new ArrayList<AccountDTO>();
		for (Account account : accounts) {
			accountDTOs.add(AccountAdapter.getAccountDto(account));
		}
		return accountDTOs;
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}
}
