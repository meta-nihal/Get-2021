import java.util.Arrays;

public final class intSet {
	
	private final int[] Set;

	public intSet(int[] temporarySet) throws AssertionError {
		super();
		int []Set1=new int[temporarySet.length];
		
		Set1 = checkConditions(temporarySet);
		this.Set = Set1;
	}
	
	private int[] checkConditions(int[] temporarySet) throws AssertionError{
		
		Arrays.sort(temporarySet);
		if(temporarySet.length==0 )
			return temporarySet;
		
		if(temporarySet[0]<1 && temporarySet[0]>1000)
			throw new AssertionError();
		
		for(int i=1;i<temporarySet.length;i++)
		{
			if(temporarySet[i]<1 && temporarySet[i]>1000)
				throw new AssertionError("Value should be between 1 and 1000");
		
	   }
		
		int size=1;
		for(int i=1;i<temporarySet.length;i++)
		{	
		 if (temporarySet[i] != temporarySet[i - 1]) {
             size++;
         }
		}
		
		int result[] = new int[size];
        result[0] = temporarySet[0];
        int resultIndex = 1;
        for (int i = 1; i < temporarySet.length; i++) {
            if (temporarySet[i] != temporarySet[i - 1]) {
                result[resultIndex] = temporarySet[i];
                resultIndex++;	
            }
        }
		return result;
	
	}

	boolean isMember(int x)
	{
		for(int i=0;i<Set.length;i++)
		{
			if(Set[i]==x)
				return true;
		}
		
		return false;
	}
	
	public int size()
	{
		return Set.length;
	}
	
	boolean isSubSet(intSet s )
	{
		int temp[]=s.Set;
		
		for(int i=0;i<temp.length;i++)
		{ int flag=1;
			for(int j=0;j<Set.length;j++)
			{
				if(temp[i]==Set[j])
					flag=0;
			}
			if(flag==1)
				return false;
		}
		return true;
		
	}
	
	public int[] getComplement()
	{
		int []complementArray=new int[1000-Set.length];
		int index=0;
		for(int i=1;i<=1000;i++)
		{
			if(isMember(i)==false)
			{
				complementArray[index]=i;
				index++;
			}
			
		}
		
		return complementArray;
	}
	
	public int[] union(intSet s1,intSet s2)
	{
		int unionArray[]=new int[s1.size()+s2.size()];
		int index=0;
		
		for(int i=0;i<s1.Set.length;i++)
		{
			unionArray[index]=s1.Set[i];
			index++;
		}
		
		for(int i=0;i<s2.Set.length;i++)
		{
			unionArray[index]=s2.Set.length;
			index++;
		}
		Arrays.sort(unionArray);
		
		return unionArray;	
	}	
}
