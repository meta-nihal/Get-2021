
public class Marksheet {
	/*
	 * this method calculates the percentage of students passed
	 * given that student with grade above  or equal to 40 is passed
	 * @param grades array as an input
	 * @return percentage passed students
	 */
	public static float calculate_percentage_passed_students(int[] grades) {
	
		int total_students=grades.length;
		int passed_students=0;
		float percentage_passed_students=0.00f;
		
		for(int i=0;i<grades.length;i++)
		{
			if(grades[i]>=40)
				passed_students++;
		}
		
		try
		{
			if(total_students==0)
				throw new ArithmeticException();
			percentage_passed_students=(passed_students*100)/total_students;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception : "+ e.getMessage());
			System.out.println("Number of students should be greater than 0");
		}
		return percentage_passed_students;
	}
	
	/*
	 * this method calculates the maximum grade obtained amongst the student
	 * @param grades array as an input
	 * @return maximum grade among students
	 */
   public static int calculate_maximum(int[] grades) {
	    int maximumNumber=Integer.MIN_VALUE;
	    
	    for(int i=0;i<grades.length;i++)
	    {
	    	if(grades[i]>maximumNumber)
	    		maximumNumber=grades[i];
	    }
		return maximumNumber;
	}

	/*
	 * this method calculates the average grade of student
	 * @param grades array as an input
	 * @return  average grade
	 */
	public static float calculate_average(int[] grades) {
		
		int sum_grades=0;
		float average_grade=0.00f;
		
		for(int i=0;i<grades.length;i++)
		{
			sum_grades+=grades[i];
		}
		
		try
		{
			if(grades.length==0)
				throw new ArithmeticException();
		    average_grade=sum_grades/grades.length;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception : "+ e.getMessage());
			System.out.println("Number of students should be greater than 0");
		}
		return average_grade;
	}

	/*
	 * this method calculates the minimum grade obtained amongst the student
	 * @param grades array as an input
	 * @return maximum grade among students
	 */
	public static int calculate_minimum(int[] grades) {
	
        int minumumNumber=Integer.MAX_VALUE;
		
		for(int i=0;i<grades.length;i++)
		{
			if(grades[i]<minumumNumber)
				minumumNumber=grades[i];
		}
		return minumumNumber;
		
	}
}
