import java.util.Scanner;
public class MainCalculation {

	public static void main(String []args)
	  {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter String1");
		 String str1=sc.next();
		 System.out.println("Enter String2");
		 String str2=sc.next();
		  
		  HexCalc cal = new HexCalc(str1,str2);
		  System.out.println(cal.add());
		  System.out.println(cal.subtract());
		  System.out.println(cal.multiply());
		  System.out.println(cal.divide());
		  System.out.println(cal.isEqual());
		  System.out.println(cal.isGreater());
		  System.out.println(cal.isLesser());
	  }
}
