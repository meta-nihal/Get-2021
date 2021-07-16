package jUnitclass;
public class ArrOperations {
	
	ArrOperations arrOperation;

	/**
     * this method finds largest mirror section
     *
     * @param inputArray contains an array of integers
     *        
     *        assert error throw : when array is empty
     *        
     * @return int value 
     */
	public static int maxMirror(int[] inputArray) {
		 int arrayLength=inputArray.length;
	     int count=0;
	     int maxLen=0;
	     
	    // assert(arrayLength !=0):"inputArray is Empty";
	    
	     if(inputArray.length == 0)
	     {
	    	 throw new AssertionError();
	     }
	     
	     for(int i=0;i<arrayLength;i++)
	     {
	         int k=i;
	         for(int j=arrayLength-1;j>=0;j--)
	         { 
	             if(k<arrayLength && inputArray[k]==inputArray[j])
	             {
	                 k++;
	             }
	             else
	             {
	                 if(k>i)
	                 {
	                     count=k-i;
	                     break;
	                 }
	                 
	                 continue;
	                 
	             }
	         }
	         count=k-i;
	         if(count>maxLen)
	          maxLen=count;
	     }

		return maxLen;
	}

	/**
     * this method Count clumps in integer array
     *
     * @param inputArray array contain number of Integer
     *        
     *        assert error throw : when array is empty
     *        
     * @return int value 
     */
	public static int countClumps(int[] inputArray) {
		int arrayLength=inputArray.length;
		int count=0;
		
		//assert(arrayLength !=0):"inputArray is Empty";
		
		if(inputArray.length == 0)
	     {
	    	 throw new AssertionError();
	     }
		
		for(int i=0;i<arrayLength-1;)
		{
		    if(inputArray[i]==inputArray[i+1])
		    { 
		     do{
		         i++;
		     }while(i< arrayLength-1 && inputArray[i]==inputArray[i+1]);
		     count+=1;
		     i=i+1;
		    }
		    else{
		         i=i+1;
		    }
		}
		return count;
	}
	
	/**
     * this method fix the x and y position where y place just after x. 
     *
     * @param Y  to fix the x and y position
     * 
     *          assert error throw : when array is empty
     *                               when two adjacent x are place
     *                               when last position of array contain x
     *                               when frequency of x and y are not equal
     * @param X  to fix the x and y position
     * @param inputArray array contain number of Integer
     * @return integer array which contain fix position of x and y  
     */
	public static int[] fixXY(int X,int Y, int[] inputArray) {
	
		int arrayLength=inputArray.length;
		int countX=0,countY=0;
		
	//	assert(arrayLength !=0):"inputArray is Empty";
		 if(inputArray.length == 0)
	     {
	    	 throw new AssertionError("AssertionError:inputArray is Empty");
	     }
		
		for(int i=0;i<arrayLength;i++)
		{
		    if(inputArray[i]==X)
		     countX++;
		     
		     if(inputArray[i]==Y)
		     countY++;
		 }
		
		
	//	assert(countX == countY) : "Error frequency of X and Y are not equal";
		
		if(countX!=countY)
		{
			throw new AssertionError("AssertionArray:frequency of X and Y are not equal");
		}
	
    //  assert(inputArray[i+1] != X) : "Error two continuous X in the inputArray";
		for(int i=1;i<inputArray.length;i++)
		{
			if(inputArray[i]==X && inputArray[i-1]==X)
			{
				throw new AssertionError("AssertionError:two adjacent X");
			}
		}
		
	//	assert(inputArray[arrayLength-1] != X) : "Error X is present at the last positon";
		
		if(inputArray[arrayLength-1] == X)
		{
		   throw new AssertionError("AssertionArray:X is present at the last position");	
		}
		
		int j=0;  
		for(int i=0;i<arrayLength;i++)
		{
		    if((i+1 < arrayLength) && inputArray[i]==X)
		    {
		        
		         while(j<arrayLength)
		         {
		            if(inputArray[j]==Y)
		            {
		                inputArray[j]=inputArray[i+1];
		                inputArray[i+1]=Y;
		                
		            }
		            j++;
		         }
		         
		         j=i+2;
		    }   
		   
		   System.out.println();
		}
		return inputArray;
	}

	/**
     * this method Splits array so that the sum of the numbers on one side is equal 
     * to the sum of the numbers on the other side
     *
     * @param inputArray array contain number of Integer
     *        
     *        assert error throw : when array is empty
     *        
     * @return int value 
     */
	public static int splitArray(int[] inputArray) {
	
		int sum_of_array=0;
		int arrayLength=inputArray.length;
		
		//assert(arrayLength !=0):"inputArray is Empty";
		if(inputArray.length == 0)
	     {
	    	 throw new AssertionError();
	     }
		
		for(int i=0;i<arrayLength;i++)
		{
		    sum_of_array+=inputArray[i];
		}
		
		if(sum_of_array%2!=0)
		{ return -1;
		 
		}
		
		int half_sum_of_array =sum_of_array/2;
		for(int j=arrayLength-1;j>=0;j--)
		{
		    half_sum_of_array=half_sum_of_array-inputArray[j];
		    
		    if(half_sum_of_array==0)
		    {
		        return j;
		        
		    }
		    
		    else if(half_sum_of_array<0)
		    {
		    	return -1;
		       
		    }
		}
		return -1;
	}

}
