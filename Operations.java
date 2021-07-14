package scf;

public class Operations {

	/*
	 * This method checks whether string1 is equal to string2
	 * If they are equal then method will return 1
	 * else method will return 0
	 * @param str1 First String input
	 * @param str2 Second String input
	 * @return integer value is returned 
	 */
	public static int areEqual(String str1,String str2)
	{
		if(str1.length()!=str2.length())
			return 0;
		
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
				return 0;
		}
		
		return 1;
	}
	
	/*
	 * This method returns reverse of the input string
	 * @param str1 String input
	 * @return str2 is returned
	 */
	
	public static String reverse(String str1)
	{
		String str2="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2+=str1.charAt(i);
		}
		
		return str2;
	}
	
	/*
	 * This method converts lower case into upper case
	 * and vice versa and return the output string
	 * @param str1 string input
	 * @return str1 string output
	 */
	
	public static String reverseCase(String str1)
	{
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
			char c=str1.charAt(i);
			if(c>='a' && c<='z')
			{
				c+=('A'-'a');
			}
			
			else if(c>='A' && c<='Z')
			{
				c+=('a'-'A');
			}
			
			str2+=c;
		}
		
		return str2;
	}

	/*
	 * this method find the largest possible word in a given string
	 * @param str1 string input
	 * @return str2 word which is largest is returned
	 */
	public static String largestWord(String str1) {
		
		int firstIndex=0;
		int wordLength=0;
		int maxFirstIndex=0;
		int maxWordLength=0;
		int lastIndex=0;
		char ch;
		
		for(int i=0;i<str1.length();i++)
		{
			ch=str1.charAt(i);
			if(ch==' ')
			{
				if(wordLength>=maxWordLength)
				{
					maxWordLength=wordLength;
					maxFirstIndex=firstIndex;
				}
				wordLength=0;
			}
			
			else
			{
				if(wordLength==0)
					firstIndex=i;
				wordLength++;
			}
		}
		
		if(wordLength>=maxWordLength)
		{
			maxWordLength=wordLength;
			maxFirstIndex=firstIndex;
		}
		if(maxWordLength==0)
			return null;
		
	    lastIndex=maxFirstIndex+maxWordLength;
		String str2=str1.substring(maxFirstIndex,lastIndex);
		
		return str2;
	}
	
	
}
