

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MathematicalTest {
  

   @Test
  public void testMethod()
   {
	
	Mathematical_Operations op = new Mathematical_Operations();
	System.out.println(op.findHCF(8, 20));
	
   }
   
  @Test
  public void testMethod1()
   {
	  Mathematical_Operations op = new Mathematical_Operations();
		System.out.println(op.findLCM(8, 20));
   }
   
	 
}