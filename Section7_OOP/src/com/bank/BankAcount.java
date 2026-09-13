package com.bank;

public class BankAcount {
	private int accountNNumber;
	private int balance;
	private String customerName;
	private String email;
	private long phone;

	public BankAcount() {
		super();
		System.out.println("Default");
	}

	public BankAcount(int accountNNumber, int balance, String customerName, String email, long phone) {
		super();
		this.accountNNumber = accountNNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
	}

	public int getAccountNNumber() {
		return accountNNumber;
	}

	public void setAccountNNumber(int accountNNumber) {
		this.accountNNumber = accountNNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balnce) {
		this.balance = balnce;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "BankAcount [accountNNumber=" + accountNNumber + ", balance=" + balance + ", customerName=" + customerName
				+ ", email=" + email + ", phone=" + phone + "]";
	}

	public void depositFunds(int funds) {
		this.balance = this.balance + funds;
		System.out.println("Deposite of " + funds + " Successfull. New Balance: " + this.balance);
	}

	public void withdrawFunds(int funds) {
		if ((this.balance - funds) <= 0) {
			System.out.println("Deposite requested of " + funds + ". You dont have enough balance. Balance = " + this.balance);
		} else {
			this.balance = this.balance - funds;
		}
	}

}
