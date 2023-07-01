/**
 * 
 */
package com.eazybytes.accounts.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author EazyBytes
 *
 */
@Getter
@Setter
@ToString
public class CustomerDetails {
	
	private Accounts accounts;
	private List<Loans> loans;
	private List<Cards> cards;
	public void setAccounts(Accounts accounts2) {
		// TODO Auto-generated method stub
		
	}
	public void setLoans(List<Loans> loans2) {
		// TODO Auto-generated method stub
		
	}
	public void setCards(List<Cards> cards2) {
		// TODO Auto-generated method stub
		
	}
	
	

}