
public class Search {
     
	/*
	 * this method calculates the index of element to be searched
	 * @param inputArray for storing elements
	 * @param leftIndex of array 
	 * @param element to be searched 
	 * @return index of element to be searched
	 */
	public static int linearSearch(int[] inputArray,int leftIndex, int element) {
		if(inputArray[leftIndex]==element)
			 return leftIndex;
		if(leftIndex==inputArray.length)
			return -1;
		
		return linearSearch(inputArray,leftIndex+1,element);
	}

	/*
	 * this method calculates the index of element to be searched
	 * @param inputArray for storing elements
	 * @param leftIndex of array 
	 * @param rightIndex of array
	 * @param element to be searched 
	 * @return index of element to be searched
	 */
	public static int binarySearch(int[] inputArray,int leftIndex,int rightIndex,int element) {
		
        if(rightIndex>=leftIndex && leftIndex<inputArray.length-1)
        {
        	int midIndex=(rightIndex+leftIndex)/2;
        	
        	if(inputArray[midIndex]==element)
        		return midIndex;
        	
        	if(inputArray[midIndex]>element)
        		return binarySearch(inputArray,leftIndex,midIndex-1,element);
        	
        	return binarySearch(inputArray,midIndex+1,rightIndex,element);
        }
		
		return -1;
	}

}
