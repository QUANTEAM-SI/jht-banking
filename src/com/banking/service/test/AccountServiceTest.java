package com.banking.service.test;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.banking.beans.Account;
import com.banking.beans.Client;
import com.banking.beans.Operation;
import com.banking.service.AccountService;
import com.banking.service.AccountServiceImpl;

public class AccountServiceTest {
	
	private AccountService service = new AccountServiceImpl();
	private Long idAccount= new Long(39493053);
	private Long idClient= new Long(6575);
	

	@Before
	public void setUp() throws Exception {
		//Doing some stuff here...
		
		//idClient= 6575		
		Client client= new Client(idClient, "DUPONT");
		service.getClients().put(idClient, client);
		
		//idAccount= 30533949		
		Account account=new Account(idAccount, idClient);
		account.setBalance(250.15);
		service.getAccounts().put(idAccount, account);	
		
	}

	

	@Test //US 1 - Make a deposit
	public void testUserStory() {
		
		double oldBalance=0.0;
		double newBalance=0.0;
		
		try{
			Account account = service.getAccountById(idAccount);
			oldBalance= account.getBalance();
			service.makeDeposit(idAccount, new Double(15.55));
			newBalance=account.getBalance();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}		
		
		if(newBalance != (oldBalance + 15.55)) {
			fail("Le montant n'a pas été crédité");
		}
		System.out.println("\n\n*** USER STORY 1 ***");
		System.out.println("\nSOLDE=" + newBalance);
	}

	@Test //US 2 - Make a Withdrawal
	public void testUserStory2() {
		
		double oldBalance=0.0;
		double newBalance=0.0;
		
		try{
			Account account = service.getAccountById(idAccount);
			oldBalance= account.getBalance();
			service.makeWithdrawal(idAccount,  new Double(10.00));
			newBalance=account.getBalance();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}		
		
		if(newBalance != (oldBalance-10.00)) {
			fail("ERREUR: Le montant  retiré est incorrect. \n Solde=" + newBalance);
		}
		System.out.println("\n\n*** USER STORY 2 ***");
		System.out.println("\nSOLDE=" + newBalance);
	
	}
	

	@Test  //US 3 - Get Operations history
	public void testUserStory3() {
		List<Operation> operations = null;
		try{
			service.makeDeposit(idAccount, new Double(30.50));
			service.makeWithdrawal(idAccount,  new Double(10.00));
			service.makeWithdrawal(idAccount,  new Double(10.00));
			operations = service.getAccountHistory(idAccount);			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}		
		if(operations== null) {
			fail("Historique à null.");
		}else if (operations.size() != 3) {
			fail("La taille de l'historique est erronée.");
		}
		System.out.println("\n\n*** USER STORY 3 ***");
		System.out.println("\n*** HISTORIQUE *** ");
		for(Operation o: operations) {
			System.out.println("\n" + o );
		}
	}


}
