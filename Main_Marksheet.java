import java.util.Scanner;

public class Main_Marksheet {

	static Scanner sc = new Scanner(System.in);
	  
	  public static void main(String []args)
	  {
		  int num_of_students;
		  do
		  {
			  System.out.println("Enter number of students in class");
		       num_of_students= sc.nextInt();
		  
		      if(num_of_students<0)
			    System.out.println("Enter valid positive number");
		      else
		    	 break;
		      
		  }while(true);   
		      
		  System.out.println("Enter grades of each student");
		  System.out.println("Grade should be between 0 and 100 inclusive");
		  
		  int []grades =new int[num_of_students];
		  for(int i=0;i<num_of_students;i++)
		  {
			  System.out.println("Enter grade of student"+(i+1));
			   grades[i]=sc.nextInt();
		  }
		  
		  int option;
		  
		  do
		  {
			  System.out.println();
			  System.out.println("1. Find average grade");
			  System.out.println("2. Find maximum grade");
			  System.out.println("3. Find minimum grade");
			  System.out.println("4. Find percentage of passed students");
			  System.out.println("5. Exit");
			  
			  option=sc.nextInt();
			  switch(option)
			  {
			  		
			  case 1  : float average_score=Marksheet.calculate_average(grades);
			            System.out.printf("Average score of students is %.2f ",average_score);               
				        break;
				        
			  case 2  : int maximum_grade=Marksheet.calculate_maximum(grades);
			            System.out.println("Maximum grade is "+maximum_grade);               
			            break;
			       
			  case 3  :  int minimum_grade=Marksheet.calculate_minimum(grades);
			             System.out.println("Minimum grade is "+minimum_grade);              
			             break;
			        
			  case 4  :  float student_passing_percent=Marksheet.calculate_percentage_passed_students(grades);
			             System.out.printf("Percentage of students passed is %.2f",student_passing_percent);             
			             break;
			        
			  case 5  :  
				         break;
			  
			  default : System.out.println("Invalid choice.");
			             break;
			  }
			  
		    }while(option!=5);

	  }
}
