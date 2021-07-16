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
public class MaxMirrorClass {
	
	int[] input;
	int expected;
	 
	public MaxMirrorClass(int input[],int expected){
		 this.input=input;
		 this.expected=expected;
	}	

	
  @Parameters
  public static Collection<Object[]> data()
  {
	  return Arrays.asList(new Object[][]
			  {
		        {new int[] {1,2,3,8,9,3,2,1},3},
		        {new int[] {7,1,4,9,7,4,1},2},
                {new int[] {1,2,1,3},3}});
			  
  }
  @Test
  public void testMethod()
   {
	 
	assertEquals(expected,ArrOperations.maxMirror(input));
   }
  
  @Test
  public void TestEmpty()
  {
	  Assertions.assertThrows(AssertionError.class,()->{
		  ArrOperations.maxMirror(new int[] {});
	  });
  }
	
}
