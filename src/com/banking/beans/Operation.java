package com.banking.beans;

public class Operation {
	
	private  Long idOperation;
	private  Long idAccount;
	private	 String typeOperation;
	private  Double amountOperation;
	
	
	
	public Operation(Long idOperation, Long idAccount, String typeOperation, Double amountOperation) {
		super();
		this.idOperation = idOperation;
		this.idAccount = idAccount;
		this.typeOperation = typeOperation;
		this.amountOperation = amountOperation;
	}

	public Long getIdOperation() {
		return idOperation;
	}
	
	public void setIdOperation(Long idOperation) {
		this.idOperation = idOperation;
	}
	
	public Long getIdAccount() {
		return idAccount;
	}
	
	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}
	
	public String getTypeOperation() {
		return typeOperation;
	}
	
	public void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}
	
	public Double getAmountOperation() {
		return amountOperation;
	}
	
	public void setAmountOperation(Double amountOperation) {
		this.amountOperation = amountOperation;
	}

	@Override
	public String toString() {
		return "Operation [idOperation=" + idOperation + ", idAccount=" + idAccount + ", typeOperation=" + typeOperation
				+ ", amountOperation=" + amountOperation + "]";
	}
	
	

}
