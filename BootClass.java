package org.AAA.boot;

import org.AAA.model.Customer;
import org.AAA.view.UserInteraction;

public class BootClass {

	public static void main(String[] args) {
	
		UserInteraction ui=new UserInteraction();
		Customer customer=ui.getCustomerDetails();
		
		System.out.println(customer);
	}

}
