import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PolyTest {

	/*
	 * test method contains an array and tests for evaluate method
	 */
	@Test
	void testMethod1() {
		int []arr=new int[] {1,2,3};
		Poly p1=new Poly(arr);
		Assertions.assertEquals(p1.evaluate(arr, 2),17.0);
	}
	
	/*
	 * test method array contains negative integer 
	 * the test case will fail
	 */
	@Test
	void testMethod2() {
		int []arr=new int[] {1,1,1};
		Poly p2=new Poly(arr);
		p2.degree(arr);
	}
	
	/*
	 * test method uses the add method for adding polynomial
	 */


	@Test
	void testMethod3()
	{
		int []arr=new int[] {1,1};
		int []brr=new int[] {1,1};
		Poly p3=new Poly(arr);
		Poly p4=new Poly(brr);
		
		Assertions.assertArrayEquals(new int[] {2,2},p3.addPoly(p3, p4));
		
	}
	
	@Test
	void testMethod4()
	{
	int arr1[]= {1,1};
	int arr2[]= {0,0,1,};
	Poly p1=new Poly(arr1);
	Poly p2=new Poly(arr2);
	Assertions.assertArrayEquals(p1.multiPoly(p1, p2),new int[] {0,0,1,1});
	}



	
}
