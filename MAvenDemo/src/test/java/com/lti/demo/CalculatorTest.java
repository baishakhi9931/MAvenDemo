package com.lti.demo;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator c = new Calculator();

	@Test
	public void testsayHello()
	{
		Assertions.assertEquals("Hello",c.sayHello());
	}
	@Test
	public void testadd() {
		Assertions.assertEquals(100, c.add(60,40));
	}
	@Test
    void testException1() {



       Calculator c= new Calculator();
        
        final Exception e = assertThrows(ArithmeticException.class, () -> {
            c.searchEmpId(0);
      
      });
        
        
      Assertions.assertEquals("u enetered zero",e.getMessage());
    }
	private Exception assertThrows(Class<ArithmeticException> class1, Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	private Exception assertThrows(Class<ArithmeticException> class1, Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


