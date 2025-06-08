package grouping;

import org.testng.annotations.Test;


public class payments {
	
	
	@Test (priority = 1,groups = {"sanity","regression","functional"})
	void paymentInRupee() {
		System.out.println("Payment in rupee");
	}
	
	@Test (priority = 2,groups = {"sanity","regression","functional"})
	void paymentInDollar() {
		System.out.println("Payment in dollar");
	}
}

