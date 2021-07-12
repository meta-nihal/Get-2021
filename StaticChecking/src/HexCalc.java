interface Operations
{
	public String add();
	public String subtract();
	public String multiply();
	public String divide();
	public boolean isEqual();
	public boolean isGreater();
	public boolean isLesser();
}
public class HexCalc implements Operations{
  String str1,str2;
  public HexCalc(String str1,String str2)
  {
	  super();
	  this.str1=str1;
	  this.str2=str2;
  }
  
  public static void main(String []args)
  {
	  String str1="5";
	  String str2="1";
	  
	  HexCalc cal = new HexCalc(str1,str2);
	  System.out.println(cal.add());
	  System.out.println(cal.subtract());
	  System.out.println(cal.multiply());
	  System.out.println(cal.divide());
	  System.out.println(cal.isEqual());
	  System.out.println(cal.isGreater());
	  System.out.println(cal.isLesser());
  }
  
  public String add()                                 //this method adds string1 and string2
  {
	  int num1=hex_to_dec(str1);
	  int num2=hex_to_dec(str2);
	  int num3=num1+num2;
	  
	  String s=dec_to_hex(num3);
	  return s;
  }
  
  public String subtract()                                 //this method subtracts string 2 from string 1
  {
	  int num1=hex_to_dec(str1);
	  int num2=hex_to_dec(str2);
	  int num3=num1-num2;
	  if(num3<=0)
		  System.out.println("Result is a negative number");
	  String s=dec_to_hex(num3);
	  return s;
  } 
  
  public String multiply()                                  //this method multiply string 1 by string2
  {
	  int num1=hex_to_dec(str1);
	  int num2=hex_to_dec(str2);
	  int num3=num1*num2;
	  
	  String s=dec_to_hex(num3);
	  return s;
  }
  
  public String divide()                                     //this method divides string1 by string2
  {
	  int num1=hex_to_dec(str1);
	  int num2=hex_to_dec(str2);
	  int num3=num1/num2;
	  if(num3<1)
		  System.out.println("Result is less than 1");
	  String s=dec_to_hex(num3);
	  return s;
  }
  
  
  
  public  int hex_to_dec(String str)                          //this method converts hexadecimal to decimal
  {
	  
	  int num=0,count=1,hex_base=16;
	  for(int i=str.length()-1;i>=0;i--)
	  {
         char c=str.charAt(i);
         int dig=ch_to_num(c);
        // System.out.println(dig);
         num+=count*dig;
         
         count=count*hex_base;
	  }
	  return num;
  }
  
  
  public  int ch_to_num(char c)                             //this method converts character to number
  { 
	  int dig;
	  if(c>=65 && c<=70)
		  dig=c-'A';
	  else	  
		  dig =c-'0';  
	  return dig;
  }
  
  public String dec_to_hex(int num)                 //this method converts decimal to hexadecimal
  {
	  int rem,hex_base=16;  
	     String hex="";   
	     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
	    while(num>0)  
	     {  
	       rem=num%hex_base;   
	       hex=hexchars[rem]+hex;   
	       num=num/hex_base;  
	     }  
	    return hex; 
  }

  public boolean isEqual()                            //this method checks for equality of string
  {
	  if(str1.equals(str2))
	   return true;
	  else 
	   return false;
  }
    
  public boolean isGreater()                          //this method checks if string 1 is greater than string 2
  {
	  boolean result=true;
	  int count=0;
	  if(str1.length()!=str2.length())
	  {
		  if(str1.length()>str2.length())
		   return true;
		   
		  else
			result=false;
	  }
     else
		 {
			 for(int i=0;i<str1.length();i++)
			 {
				 if(str1.charAt(i)>str2.charAt(i))
					 return true;
				 else
					 count++;
		     }
			
			 if(count==str1.length())
				 result=false;
		 }
	return result;
  }
  
  public boolean isLesser()                        // this method checks if string 1 is smaller than string 2
  {
	  boolean result=true;
	  int count=0;
	  if(str1.length()!=str2.length())
	  {
		  if(str1.length()<str2.length())
		   return true;
		   
		  else
			result=false;
	  }
     else
		 {
			 for(int i=0;i<str1.length();i++)
			 {
				 if(str1.charAt(i)<str2.charAt(i))
					 return true;
				 else
					 count++;
			 }
			 
			 if(count==str1.length())
				 result=false;
		 }
	 return result;
  }
}
