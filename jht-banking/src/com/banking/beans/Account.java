package com.banking.beans;

public class Account {
	
	private  Long idAccount;	
	private  Long idClient;
	private  Double balance=0.0;
	
	
	
	public Account(Long idAccount, Long idClient) {
		super();
		this.idAccount = idAccount;
		this.idClient = idClient;
	}

	public Long getIdAccount() {
		return idAccount;
	}
	
	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}
	
	public Long getIdClient() {
		return idClient;
	}
	
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}

}
