package com.revature.service;



import org.apache.log4j.Logger;

import com.revature.entity.account;

import com.revature.repository.AccountRepository;

public class TxrServiceImp1 implements TxrService {

	private static Logger logger = Logger.getLogger("txr-system");

	private AccountRepository accountRepository;

	public TxrServiceImp1(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public boolean transfer(double amount, String fromAcc, String toAcc) {

		logger.info("txr intiated...");

		account fromAccount = accountRepository.load(fromAcc);

		if (fromAccount == null) {
			logger.error("account not found " + fromAcc);
			throw new AccountNotFoundException(fromAcc);
		}

		account toAccount = accountRepository.load(toAcc);

		if (toAccount == null) {
			logger.error("account not found " + toAcc);
			throw new AccountNotFoundException(toAcc);
		}

		if (fromAccount.getBalance() < amount) {
			logger.error("no enough balance " + fromAccount.getBalance());
			throw new AccountBalanceException(fromAccount.getBalance());
		}

		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);

		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);



		logger.info("txr success...");
		boolean t=true;
		return t;
	}

}