import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

class intSetTest {

	/*
	 * test method contains positive integer greater than 1000
	 * the test case will fail
	 */
	@Test
	void testMethod1() {
		int []arr=new int[] {1,2,1004};
		new intSet(arr);
		System.out.println("Value cannot be greater than 1000");
	}
	
	/*
	 * test method array contains negative integer 
	 * the test case will fail
	 */
	@Test
	void testMethod2() {
		int []arr=new int[] {1,2,-1};
		new intSet(arr);
		System.out.println("Value cannot be negative");
	}
	
	/*
	 * test method uses complement method for checking the conditions
	 */


	@Test
	void testMethod3()
	{
		intSet s1;
		int evenintegers[]=new int[500];
		int oddintegers[]=new int[500];
		
		for(int i=0;i<500;i++)
		{
			evenintegers[i]=(i*2)+2;
		}
		for(int i=0;i<500;i++)
		{
			oddintegers[i]=(i*2)+1;
		}
	    s1=new intSet(oddintegers);
		Assertions.assertArrayEquals(s1.getComplement(),evenintegers);
	}
	
	@Test
	void testMethod4()
	{
	int arr1[]= {1,2,3,4,5,6,7,8,9,10};
	int arr2[]= {2,3,4,10};
	intSet s1=new intSet(arr1);
	intSet s2=new intSet(arr2);
	Assertions.assertEquals(s1.isSubSet(s2),true);
	}


	@Test
	void testMethod5()
	{
		intSet s1;
		intSet s2;
		//intSet s3;
		//intSet s4;
		int evenintegers[]=new int[500];
		int oddintegers[]=new int[500];
		int range[]=new int[1000];
		for(int i=0;i<500;i++)
		{
			evenintegers[i]=(i*2)+2;
		}
		for(int i=0;i<500;i++)
		{
			oddintegers[i]=(i*2)+1;
		}
		for(int i=0;i<1000;i++)
		{
			range[i]=i+1;
		}
		
		s1=new intSet(oddintegers);
		s2=new intSet(evenintegers);
		//s4=new intSet(range);
		Assertions.assertArrayEquals(s2.union(s1,s2),range);
	}
	
	
	@RunWith(Parameterized.class)
	public static class ParameterizedClass
	{
		
	}
  
}
