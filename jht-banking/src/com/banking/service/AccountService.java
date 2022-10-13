/**
 * 
 */
package com.banking.service;

import java.util.List;
import java.util.Map;

import com.banking.beans.Account;
import com.banking.beans.Client;
import com.banking.beans.Operation;

/**
 * @author Admin
 *
 */
public interface AccountService {
	
	
	public Map<Long, Account> getAccounts();

	public Map<Long, Client> getClients() ;

	//public Map<Long, List<Operation>> getOperations() ;
	
	/**
	 *  Make a cash Deposit
	 *  Faire un depot sur le compte
	 * @param amount
	 * @throws Exception 
	 */
	void makeDeposit(Long idAccount, Double amount) throws Exception;
	
	/**
	 *  Make a cash withdrawal
	 *  Faire un retrait sur le compte	 *
	 * @param amount
	 * @throws Exception 
	 */
	void makeWithdrawal(Long IdAccount, Double amount) throws Exception;
	
	/** 
	 * Recuperer la position du compte
	 * @return
	 * @throws Exception 
	 */
	Account getAccountById(Long idAccount) throws Exception;
	
	/**
	 * Récupérer l'historique des opérations du compte
	 * @param idAccount
	 * @return
	 */
	List<Operation> getAccountHistory(Long idAccount);

	
	

}
