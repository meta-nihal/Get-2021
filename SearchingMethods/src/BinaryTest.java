
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BinaryTest {
	
	int[] inputArray;
	int x;
	int expected;
    int element;
    int leftIndex;
    int rightIndex;
	 
	public BinaryTest(int inputArray[],int leftIndex,int rightIndex,int element,int expected){
		 this.inputArray=inputArray;
		 this.element=element;
		 this.leftIndex=leftIndex;
		 this.rightIndex=rightIndex;
		 this.expected=expected;
	}	
	
  @Parameters
  public static Collection<Object[]> data()
  {
	  return Arrays.asList(new Object[][]
			  {
		        {new int[] {1,2,3,4,5},0,5,4,3},
		        {new int[] {1,2,3,4,5},0,5,5,4},
                {new int[] {1,2,3,4,5},0,5,6,-1}});
			  
  }
  @Test
  public void testMethod()
   {
	 
	assertEquals(Search.binarySearch(inputArray,leftIndex,rightIndex,element),expected);
   }
 
}