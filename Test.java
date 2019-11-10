package refactoring;
import org.junit.*;

class Test {

	@Test
	void statTest() {
		Customer c = new Customer("Name");

		assertEquals(c.statement(),"Rental Record for Name\n" + 
				"Amount owed is 0.0\n" + 
				"You earned 0 frequent renter points");

		c.addRental(new Rental(new Movie("Bacurau", 1), 1));
		assertEquals(c.statement(),"Rental Record for Name\n" + 
				"	Bacurau	3.0\n" + 
				"Amount owed is 3.0\n" + 
				"You earned 1 frequent renter points");		

		c.addRental(new Rental(new Movie("Central do Brasil", 0), 2));
		c.addRental(new Rental(new Movie("Carandiru", 2), 3));

		assertEquals(c.statement(),"Rental Record for Name\n" + 
				"	Bacurau	3.0\n" + 
				"	Central do Brasil	2.0\n" + 
				"	Carandiru	1.5\n" + 
				"Amount owed is 6.5\n" + 
				"You earned 3 frequent renter points");	
	}

}