package com.revature.service;



public interface TxrService {
	boolean transfer(double amount, String fromAcc, String toAcc);
}