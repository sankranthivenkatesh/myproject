package com.revature.entity;


public class account {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String user_name;
	private String phone_no;
	private String address;
	private double balance;
	private String aadhar_no;
	private String bank_name;

	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getaadhar_no() {
		return aadhar_no;
	}
	public void setaadhar_no(String user_name) {
		this.aadhar_no = aadhar_no;
	}
	public String getbank_name() {
		return bank_name;
	}
	public void setbank_name(String user_name) {
		this.bank_name = bank_name;
	}

	@Override
	public String toString() {
		return "Account [id : " + id + ", user_name : " + user_name + ", address : " + address +", balance : " + balance +",aadhar:" + aadhar_no +",bank_name:"+ bank_name +" ]";
	}
	

}