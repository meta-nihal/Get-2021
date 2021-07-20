
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LinearTest {
	
	int[] inputArray;
	int x;
	int expected;
    int element;
	 
	public LinearTest(int inputArray[],int x,int element,int expected){
		 this.inputArray=inputArray;
		 this.element=element;
		 this.x=x;
		 this.expected=expected;
	}	
	
  @Parameters
  public static Collection<Object[]> data()
  {
	  return Arrays.asList(new Object[][]
			  {
		        {new int[] {1,2,3,4,5},0,4,3},
		        {new int[] {2,1,5,4,3},0,5,2},
                {new int[] {10,20},0,20,1}});
			  
  }
  @Test
  public void testMethod()
   {
	 
	assertEquals(Search.linearSearch(inputArray,x,element),expected);
   }
 /* 
  @Test
  public void TestEmpty()
  {
	  Assertions.assertThrows(AssertionError.class,()->{
		  ArrOperations.splitArray(new int[] {});
	  });
  }
	*/
}