package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Account;



//@NoArgsConstructor
public class BankRunner {
    public static void main(String[] args) {
    	Account account = new Account();
    	account.setName("SBI");
    	account.setBranch("Santebennur");
    	account.setAccountNum("SBI08765432");
    	System.out.println(account.getAccountNum());
    	System.out.println(account.getBranch());
    	System.out.println(account.getName());
	}
}
