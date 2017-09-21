
import static org.junit.Assert.*;

import org.junit.Test;

public class test_integer {

	@Test
	public void test() {
		Integer iValue = new Integer(10);
		  
		  assertTrue(iValue.isEven());
		  assertFalse(iValue.isOdd());
		  assertFalse(iValue.isPrime());
		  
		  Integer NewValue1 = new Integer(10);
		  
		  assertTrue(NewValue1.isEven(10));
		  assertFalse(NewValue1.isOdd(10));
		  assertFalse(NewValue1.isPrime(10));
		  assertTrue(iValue.equals(10));
		  
		  Integer NewValue2 = new Integer(7);
		  
		  assertFalse(NewValue2.isEven(7));
		  assertTrue(NewValue2.isOdd(7));
		  assertTrue(NewValue2.isPrime(7));
		  assertFalse(iValue.equals(7));
		  
		 Integer NewValue3 = new Integer(10);
		  
		  assertTrue(NewValue3.isEven(NewValue3));
		  assertFalse(NewValue3.isOdd(NewValue3));
		  assertFalse(NewValue3.isPrime(NewValue3));
		  assertTrue(iValue.equals(NewValue3));
		  
		  Integer NewValue4 = new Integer(11);
		  
		  assertFalse(NewValue4.isEven(NewValue4));
		  assertTrue(NewValue4.isOdd(NewValue4));
		  assertTrue(NewValue4.isPrime(NewValue4));
		  assertFalse(iValue.equals(NewValue4));
	}
	

}
