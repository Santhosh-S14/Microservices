package com.eazybytes.cards.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @ToString
public class Customer {

	public int customerId;
	
	public int getCustomerId() {
		return customerId;
	}

}
