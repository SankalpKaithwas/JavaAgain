package com.bank;

public class BankRunner {

	public static void main(String[] args) {
		BankAcount account = new BankAcount(9999999, 10000, "Json", "Json@email.com", 929292929 );
//		BankAcount account = new BankAcount(9999999, 10000, "Json", "Json@email.com", 929292929 );
//		account.setCustomerName("Json");
//		account.setBalance(10000);
//		account.setAccountNNumber(1234590123);
//		account.setEmail("Json@email.com");
//		account.setPhone(929292929);
		
		System.out.println(account.toString());
		account.depositFunds(99999);
		System.out.println(account.getBalance());
		account.withdrawFunds(99999999);
		System.out.println(account.getBalance());
		
		account.withdrawFunds(100);
		System.out.println(account.getBalance());
	}

}
