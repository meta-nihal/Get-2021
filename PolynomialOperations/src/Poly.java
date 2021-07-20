
public class Poly {

	private final int[] polyArray;

	public Poly(int polyArray[])
	{
		this.polyArray=polyArray;
	}
	
	/*
	 *  this method evaluates the polynomial for specific value of variable
	 *  @param polynomial array
	 *  @param value of variable
	 *  @return value of polynomial
	 */
	
	public float evaluate(int polyArray[],float varValue) {
		
		float polyValue=0;
		for(int i=0;i<polyArray.length;i++)
		{
		//	System.out.println(polyArray[i]);
			polyValue+=Math.pow(varValue, i)*polyArray[i];
		}
		
		return polyValue;
	}
	
	/*
	 * this method evaluates the degree of the polynomial
	 * @param polynomial array
	 * @return degree of polynomial
	 */
	public int degree(int polyArray[]) {
		
		for(int i=polyArray.length-1;i>=0;i--)
		{
			if(polyArray[i]!=0)
				return i;
		}
		return 0;
	}
	
	/*
	 * this method adds the two polynomials
	 * @param reference variable of poly class
	 * @param reference variable of poly class
	 * @return array formed after addition
	 */
	
	public int[] addPoly(Poly p1,Poly p2)
	{
		int lengthPoly1=p1.polyArray.length;
		int lengthPoly2=p2.polyArray.length;
	    int lengthResultant=0;
	    int minsize=0;
	    
		if(lengthPoly1>lengthPoly2)
		{
			lengthResultant=lengthPoly1;
			minsize=lengthPoly2;
		}
		else
		{
			lengthResultant=lengthPoly2;
			minsize=lengthPoly1;
		}
			
		
		int []resultantArray=new int[lengthResultant];
		
		for(int i=0;i<minsize;i++)
		{
			resultantArray[i]=p1.polyArray[i]+p2.polyArray[i];
		}
		
		if(minsize==lengthPoly1)
		{	
		  for(int i=minsize;i<lengthResultant;i++)
		  {
			resultantArray[i]=p2.polyArray[i];
		  }
		}
		else
		{
			for(int i=minsize;i<lengthResultant;i++)
			{
				resultantArray[i]=p1.polyArray[i];
			}
		}
	return resultantArray;
 }
	
	/*
	 * this method multiplies the two polynomials
	 * @param reference variable of poly class
	 * @param reference variable of poly class
	 * @return array formed after multiplication
	 */
	
	public int[] multiPoly(Poly p1,Poly p2)
	{
		int lengthPoly1=p1.polyArray.length;
		int lengthPoly2=p2.polyArray.length;
	    int lengthResultant=lengthPoly1+lengthPoly2-1;
		int []resultantArray=new int[lengthResultant];
		
	
		for(int i=0;i<lengthPoly1;i++)
		{  for(int j=0;j<lengthPoly2;j++)
		  {
			resultantArray[i+j]+=(p1.polyArray[i]*p2.polyArray[j]);
		  }
		  
	    }
	return resultantArray;
	}
}