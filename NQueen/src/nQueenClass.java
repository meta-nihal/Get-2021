
public class nQueenClass {
	
	/*
	 * this method checks if solution exists for nQueen problem
	 * @param board consists of queen*queen matrix
	 * @param startRow consists of first row of board
	 * @param gives no of queen
	 * @return boolean value for solution 
	 */
	static boolean nQueen(int board[][],int startRow , int queen)
	{
		
		if(solve(board,0,queen)==false)
		{
			System.out.println("No solution");
			return false;
		}
		
		return true;
	}
	
	/*
	 * this recursive method finds for particular column if we can place Queen in it 
	 * @param board consists of queen*queen matrix
	 * @param column consists of column no in which we can place queen
	 * @param takes no of queen in board
	 * @return boolean value for solution 
	 */
	static boolean solve(int board[][],int column,int queen)
	{
		if(column>=queen)
			return true;
		
		for(int i=0;i<queen;i++)
		{
			if (canPlace(board,i , column,queen))
			{	board[i][column]=1;
			
		     	if(solve(board,column+1,queen)==true)
			    	return true;
		     	board[i][column]=0;
			}	
		}
		
		return false;
	}

	/*
	 * this recursive method finds for particular row and column if we can place Queen in it 
	 * @param board consists of queen*queen matrix
	 * @param consists of row in which we can place Queen 
	 * @param column consists of column no in which we can place queen
	 * @param takes no of queen in board
	 * @return boolean value for that particular row and column queen cab be placed 
	 */
	 static boolean canPlace(int[][] board, int row, int column,int queen) {
		 int i, j;
		  
	       
	        for (i = 0; i < column; i++)
	            if (board[row][i] == 1)
	                return false;
	  
	        
	        for (i = row, j = column; i >= 0 && j >= 0; i--, j--)
	            if (board[i][j] == 1)
	                return false;
	  
	        
	        for (i = row, j = column; j >= 0 && i < queen; i++, j--)
	            if (board[i][j] == 1)
	                return false;
	  
	        return true;
	
	}

}
