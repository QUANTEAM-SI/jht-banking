package com.banking.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.banking.beans.Account;
import com.banking.beans.Client;
import com.banking.beans.Operation;

public class AccountServiceImpl implements AccountService {
	
	private Map<Long, Client> clients;
	private Map<Long, Account> accounts;
	private Map<Long, List<Operation>> operations;
	
	private Long indexOperationSEQ= new Long(0);
	
	public AccountServiceImpl() {
		accounts = new HashMap<>();
		clients  =  new HashMap<>();
		operations=  new HashMap<>();
	}
	
	
	public  List<Operation> getAccountOperations(Long idAccount){
		
		List<Operation> accountOperations=operations.get(idAccount);
		if(accountOperations==null) {
			accountOperations= new ArrayList<>();
			operations.put(idAccount, accountOperations);
		}
		return accountOperations;
	}
	
	public Map<Long, Account> getAccounts() {
		return accounts;
	}

	public Map<Long, Client> getClients() {
		return clients;
	}

	public Map<Long, List<Operation>> getOperations() {
		return this.operations;
	}

	
	@Override
	public void makeDeposit(Long idAccount, Double amount) throws Exception {
		Account account = this.getAccountById(idAccount);
		Double balance = account.getBalance();
		balance += amount;
		account.setBalance(balance);
		Operation ope= new Operation(++indexOperationSEQ, idAccount, "DEPOSIT", amount);
		getAccountOperations(idAccount).add(ope);	
	}

	
	@Override
	public void makeWithdrawal(Long idAccount, Double amount) throws Exception {
		Account account = this.getAccountById(idAccount);
		Double balance = account.getBalance();
		balance = balance - amount;
		account.setBalance(balance);
		Operation ope= new Operation(++indexOperationSEQ, idAccount, "WITHDRAWAL", amount);
		getAccountOperations(idAccount).add(ope);		
		
	}

	
	public Account getAccountById(Long idAccount) throws Exception {
		Account account = accounts.get(idAccount);
		if (account==null) {
			throw new Exception("Le compte n° " + idAccount + "n'existe pas.");
		}
		return account;	 
	}
	
		
	
	@Override
	public List<Operation> getAccountHistory(Long idAccount) {
		// Recuperer et trier la liste des operations pour le compte passe en parametre...
		return getAccountOperations(idAccount);
	}

	

}
