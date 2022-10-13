/**
 * 
 */
package com.banking.beans;

/**
 * @author Admin
 *
 */
public class Client {
	
	private Long idClient;
	private  String nameClient;
	private  String surnameClient;
	private  String addressClient;
	
	
	public Client(Long idClient, String nameClient) {
		super();
		this.idClient = idClient;
		this.nameClient = nameClient;
	}

	public Long getIdClient() {
		return idClient;
	}
	
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	
	public String getNameClient() {
		return nameClient;
	}
	
	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}
	
	public String getSurnameClient() {
		return surnameClient;
	}
	
	public void setSurnameClient(String surnameClient) {
		this.surnameClient = surnameClient;
	}
	
	public String getAddressClient() {
		return addressClient;
	}
	
	public void setAddressClient(String addressClient) {
		this.addressClient = addressClient;
	}
	
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nameClient=" + nameClient + ", surnameClient=" + surnameClient
				+ ", addressClient=" + addressClient + "]";
	}
	
	

}
