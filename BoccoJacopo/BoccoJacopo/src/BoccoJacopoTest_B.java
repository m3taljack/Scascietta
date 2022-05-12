import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoccoJacopoTest_B 
{
	BoccoJacopoClass b;
	

	/**
	 * 
	 * per ottimizzare ho inserito un Before per evitare ripetizioni nella dichiarazione dell'oggetto b
	 */
	@Before
	void setUp() throws Exception 
	{
		b = new BoccoJacopoClass();
	}

	@Test
	void test1()
	{	
		int risAtteso= 15;
		int risOttenuto= b.BoccoMet(5);
		
		assertEquals(risAtteso, risOttenuto);
	}
	
	@Test
	void test2()
	{
		int risAtteso= 1;
		int risOttenuto= b.BoccoMet(1);
		
		assertEquals(risAtteso, risOttenuto);
	}
	
	@Test
	void test3()
	{
		int risAtteso= 3;
		int risOttenuto= b.BoccoMet(2);
		
		assertEquals(risAtteso, risOttenuto);
	}
	
	

}
