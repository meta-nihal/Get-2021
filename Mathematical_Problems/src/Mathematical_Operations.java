
public class Mathematical_Operations {

	/*
	 * this method calculates HCF of two numbers
	 * @param firstNumber 
	 * @param secondNumber
	 * @return HCF of two numbers
	 */
	public static int findHCF(int firstNumber, int secondNumber) {
	
		if(firstNumber==0)
			return secondNumber;
		
		return findHCF(secondNumber%firstNumber,firstNumber);
	  
	}

	/*
	 * this method calculates LCM of two numbers
	 * @param firstNumber 
	 * @param secondNumber
	 * @return LCM of two numbers
	 */
	public static int findLCM(int firstNumber, int secondNumber) {
		
		int lcm=(firstNumber*secondNumber)/findHCF(firstNumber,secondNumber);
		
		return lcm;
	}

}
