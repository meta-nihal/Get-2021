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
public class fixXYClass {
	
	int[] input;
	int x;
	int y;
	int[] expected;
	 
	public fixXYClass(int input[],int x,int y,int expected[]){
		 this.input=input;
		 this.x=x;
		 this.y=y;
		 this.expected=expected;
	}	
	
  @Parameters
  public static Collection<Object[]> data()
  {
	  return Arrays.asList(new Object[][]
			  {
		        {new int[] {3,4,2,4,3,2},4,3, new int[] {2,4,3,4,3,2}},
		        {new int[] {1,4,1,5},4,5, new int[] {1,4,5,1}},
                {new int[] {1,4,1,5,5,4,1},4,5,new int[] {1,4,5,1,1,4,5}}});
			  
  }
  @Test
  public void testMethod()
   {
	Assertions.assertArrayEquals(ArrOperations.fixXY(x,y,input),expected);
   }
    
  @Test
	public void test2FixXY() {
		Assertions.assertArrayEquals( ArrOperations.fixXY(4,5, new int[] {5, 4, 9, 4, 9, 5}),new int[]{9, 4, 5, 4, 5, 9});
	}

	
}
