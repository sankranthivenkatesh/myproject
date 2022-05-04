package com.revature.repository;



import com.revature.entity.account;
import com.revature.entity.TDetails;
import java.util.List; 
import com.revature.entity.accountdetails;

public interface AccountRepository {
	void save(accountdetails accdetails);
	account load(String accNumber);
	void update(account account);
	public void tsave(TDetails tdetails);
	public List<TDetails> getTransfer();
	public List<accountdetails> getaccountdetails(int n1);
	void edit(int n1);
	public void delete(int id);
	public int count();
	public int countAcc();

}