
   public class sparseMatrixOperations {

	    private int row,column;
		private int length;
		private final int sparse[][]=new int[100][3];
		
		public sparseMatrixOperations(int row,int column) {
		this.row=row;
		this.column=column;
		this.length=0;
    }
	
   /*
    * this method transpose the sparse matrix
    * @return the transposed matrix
    */
	public sparseMatrixOperations transpose() {
		
		sparseMatrixOperations result = new sparseMatrixOperations(column,row);
		result.length=length;
		
		int count[]=new int[column+1];
		
		for(int i=1;i<=column;i++)
			count[i]=0;
		
		for(int i=0;i<length;i++)
			count[sparse[i][1]]++;
		
		int index[] = new int[column+1];
		
		index[1]=0;
		
		for(int i=2;i<=column;i++)
			index[i]=index[i-1]+count[i-1];
		
		for(int i=0;i<length;i++)
		{
			int resultantPosition=index[sparse[i][1]]++;
			
			result.sparse[resultantPosition][0]=sparse[i][1];
			result.sparse[resultantPosition][1]=sparse[i][0];
			result.sparse[resultantPosition][2]=sparse[i][2];
		}
		
		result.print();
		return result;
	}

	/*
	 * this method inserts the value in row and column of the matrix
	 * @param row number
	 * @param column number
	 * @param value to be inserted
	 */
	public void insert(int row,int column,int value)
	{
		sparse[length][0]=row;
		sparse[length][1]=column;
		sparse[length][2]=value;
		
		length++;
	}
	public boolean symmetry() {
      
		sparseMatrixOperations transpose=new sparseMatrixOperations(row,column);
		transpose=transpose.transpose();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(transpose.row!=row || transpose.column !=column)
					return false;
			}
		}		
		return true;
	}

	/*
	 * this method adds two sparse matrix
	 * @param refrence to the matrix 
	 */
	public void add(sparseMatrixOperations b) {
		
		if(row != b.row || column!=b.column)
			System.out.println("Matrices can't be added");
		
		else
		{
			int position1=0,position2=0;
			sparseMatrixOperations result=new sparseMatrixOperations(row,column);
			
			while(position1 < length && position2 < b.length)
			{
				if(sparse[position1][0] > b.sparse[position2][0] ||
					(sparse[position1][0] == b.sparse[position2][0] &&
					 sparse[position1][1] > b.sparse[position2][1]))
				{
					result.insert(b.sparse[position2][0],
							b.sparse[position2][1],
							b.sparse[position2][2]);
					
					position2++;
				}
				
				else if(sparse[position1][0] < b.sparse[position2][0] ||
						(sparse[position1][0] == b.sparse[position2][0] &&
						 sparse[position1][1] < b.sparse[position2][1]))
					{
						result.insert(sparse[position1][0],
								sparse[position1][1],
								sparse[position1][2]);
						
						position1++;
					}
				else
				{
					int addval=sparse[position1][2]+b.sparse[position2][2];
					
					if(addval != 0)
						result.insert(sparse[position1][0], sparse[position2][1], addval);
					 position1++;
					 position2++;
				}
			}
			
			while(position1 < length)
				result.insert(sparse[position1][0], sparse[position1][1], sparse[position1++][2]);
			
			while(position2 < length)
				result.insert(b.sparse[position2][0],b.sparse[position2][1], b.sparse[position2++][2]);
	       
			result.print();
		}		
	}

    /*
     * this method multiplies two matrix
     * @param reference variable to matrix 
     */
	public void multiply(sparseMatrixOperations b) {

		if(column !=b.row)
		{
		   System.out.println("Can't multiply,"+"Invalid dimensions");
		   return;
		}
		
		b=b.transpose();
		int position1,position2;
		
		sparseMatrixOperations result = new sparseMatrixOperations(row,b.row);
		
		for(position1=0;position1<length;)
		{
			int currentRow=sparse[position1][0];
			
			for(position2 =0;position2<b.length;)
			{
				int currentColumn=b.sparse[position2][0];
				
				int temp1=position1;
				int temp2=position2;
				
				int sum=0;
				
				while(temp1<length && sparse[temp1][0]==currentRow 
						&& temp2 < b.length && b.sparse[temp2][0]==currentColumn)
				{
					if(sparse[temp1][1] < b.sparse[temp2][1])
						temp1++;
					else if(sparse[temp1][1] > b.sparse[temp2][1])
						temp2++;
					else
						sum+=sparse[temp1++][2]*b.sparse[temp2++][2];
				}
				
				if(sum!=0)
					result.insert(currentRow, currentColumn, sum);
				
				while(position2 < b.length && b.sparse[position2][0]==currentColumn)
				{
					position2++;
				}
			}
				while(position1 < length && sparse[position1][0] == currentRow)
					position1++;
		}
		
		result.print();
      }
		
	/*
	 * this method prints the sparse matrix
	 */
	public void print()
    {
		int [][]array = new int[4][4];
		
		for(int i=0;i<length;i++)
		{
          array[sparse[i][0]][sparse[i][1]]=sparse[i][2];		
		}
 	   for (int i = 1; i <4 ; i++) 
 	   {
		for(int j=1;j<4;j++)		  
		{   
			System.out.print(array[i][j]+ "\t");
	    }
		System.out.println();
	   }
    }
}
