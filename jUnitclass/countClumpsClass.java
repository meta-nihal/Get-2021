package jUnitclass;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class countClumpsClass {
	
	int[] input;
	int expected;
	 
	public countClumpsClass(int input[],int expected){
		 this.input=input;
		 this.expected=expected;
	}	
	
  @Parameters
  public static Collection<Object[]> data()
  {
	  return Arrays.asList(new Object[][]
			  {
		        {new int[] {1,2,2,3,4,4},2},
		        {new int[] {1,1,2,1,1},2},
                {new int[] {1,1,1,1,1},1}});
			  
  }
  @Test
  public void testMethod()
   {
	 
	assertEquals(expected,ArrOperations.countClumps(input));
   }
  @Test
  public void TestEmpty()
  {
	  Assertions.assertThrows(AssertionError.class,()->{
		  ArrOperations.countClumps(new int[] {});
	  });
  }
  
 
	
}
