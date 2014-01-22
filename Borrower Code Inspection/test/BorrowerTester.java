import static org.junit.Assert.*;

import org.junit.Test;

/** Class: BorrowerTester
 *  @author Nannette Napier
 *  @version 1.0
 *  Course : ITEC 3860 Spring 2014
 *  Written: Jan 22, 2014
 *
 *  This class ---
 *  Purpose: --
 */

/**
 * @author nnapier
 *
 */
public class BorrowerTester
{
	
	@Test
	public void testNoArgConstructor()
	{
		// Create an object using the no arg constructor
		Borrower borrower = new Borrower();
		
		// Check that all the instance variables equal
		//  "", 0, or false 
		assertEquals("Testing creditLimit", 0, borrower.getCreditLimit(), 0);
		assertEquals("Testing current balance", 0, borrower.getCurrentBalance(), 0);
		assertEquals("Testing interest rate", 0, borrower.getInterestRate(), 0);
		assertEquals("Testing day of month", 0, borrower.getDayOfMonth());
		assertEquals("Testing active Indicator", false, borrower.isActiveAccIndicate());
		
		// NOTE: The spec does not say what the Name and Address should
		//       be for the no-arg constructor. So, we cannot test this.
		assertEquals("Testing name", "Bart M Simpson", borrower.getName().getFullName());
		//assertEquals("Testing name", "", borrower.getName());
		//assertEquals("Testing address", "", borrower.getAddress());
		
	}

}
