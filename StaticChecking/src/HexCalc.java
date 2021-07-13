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
  
/*
 * this method adds two hexadecimal number
 * @return hexadecimal string of addition of the numbers  
 */
  
  public String add()                                 
  {
	  int num1=hex_to_dec(str1);
	  int num2=hex_to_dec(str2);
	  int num3=num1+num2;
	  
	  String s=dec_to_hex(num3);
	  return s;
  }
  
  /*
   * @this method subtracts string2 from string 1 
   * @return the hexadecimal string obtained after subtraction
   */
  public String subtract()                                 
  {
	  int num1=hex_to_dec(str1);
	  int num2=hex_to_dec(str2);
	  int num3=num1-num2;
	  if(num3<=0)
		  System.out.println("Result is a negative number");
	  String s=dec_to_hex(num3);
	  return s;
  } 
  
  /*
   * this method multiplies two hexadecimal numbers
   * @return the hexadecimal string after multiplication	  
   */
  public String multiply()                                  
  {
	  int num1=hex_to_dec(str1);
	  int num2=hex_to_dec(str2);
	  int num3=num1*num2;
	  
	  String s=dec_to_hex(num3);
	  return s;
  }
  
  /*
   * this divides one hexadecimal string by another string
   * @return the quotient in the hexadecimal string form
   */
  public String divide()                                    
  {
	  int num1=hex_to_dec(str1);
	  int num2=hex_to_dec(str2);
	  int num3=num1/num2;
	  if(num3<1)
		  System.out.println("Result is less than 1");
	  String s=dec_to_hex(num3);
	  return s;
  }
  
  /*
   * this method converts hexadecimal string into decimal number
   * @param hexadecimal string 
   * @return decimal form of hexadecimal number
   */
  public  int hex_to_dec(String str)                         
  {
	  
	  int num=0,count=1,hex_base=16;
	  for(int i=str.length()-1;i>=0;i--)
	  {
         char c=str.charAt(i);
         int dig=ch_to_num(c);
         num+=count*dig;
         
         count=count*hex_base;
	  }
	 // System.out.println(num);
	  return num;
  }
  
  
  /*
   * this methods converts hexadecimal character to digit
   * @return digit 
   */
  public  int ch_to_num(char c)                             //this method converts character to number
  { 
	  int dig;  
	 switch(c)
	 {
	    case 'A' : dig=10;
	               break;
	               
	    case 'B' : dig=11;
                   break;
                   
	    case 'C' : dig=12;
                   break;
                   
	    case 'D' : dig=13;
                   break;
                   
	    case 'E' : dig=14;
                   break;
                   
	    case 'F' : dig=15;
                   break;           
	 
	    default:   dig =c-'0';  
	 }
	 return dig;
  }
  
  /*
   * this method converts decimal number to hexadecimal form 
   * @param decimal number
   * @return hexadecimal form of the decimal number
   */
  public String dec_to_hex(int num)                 
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
	   // System.out.println(hex);
	    return hex; 
  }
  
 /*
  * this method checks whether string str1 is equal to string str2
  * @return true if equal else return false
  */
  public boolean isEqual()                           
  {
	  if(str1.equals(str2))
	   return true;
	  else 
	   return false;
  }
    
  /*
   * this method checks whether string str1 is greater than string str2
   * @return true if str1 is greater than str2 else return false
   */
  public boolean isGreater()                          
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
  
  /*
   * this method checks whether string str1 is lesser than string str2 
   * @return true if str1 is lesser than str2 else return false
   */
  public boolean isLesser()                       
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
				 if(str1.charAt(i)>str2.charAt(i))
					 return false;
				 else
					 count++;
			 }
			 
			 if(count==str1.length())
				 result=true;
		 }
	 return result;
  }
}
