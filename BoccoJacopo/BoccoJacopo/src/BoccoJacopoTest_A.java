import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoccoJacopoTest_A {

	@Test
	void test() 
	{
		fail("Not yet implemented");
	}
	
	@Test
	void test1()
	{
		BoccoJacopoClass b = new BoccoJacopoClass();
		int risAtteso= 15;
		int risOttenuto= b.BoccoMet(5);
		
		assertEquals(risAtteso, risOttenuto);
	}
	
	@Test
	void test2()
	{
		BoccoJacopoClass b = new BoccoJacopoClass();
		int risAtteso= 1;
		int risOttenuto= b.BoccoMet(1);
		
		assertEquals(risAtteso, risOttenuto);
	}
	
	@Test
	void test3()
	{
		BoccoJacopoClass b = new BoccoJacopoClass();
		int risAtteso= 3;
		int risOttenuto= b.BoccoMet(2);
		
		assertEquals(risAtteso, risOttenuto);
	}
	
	

}
