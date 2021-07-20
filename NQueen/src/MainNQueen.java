import java.util.Scanner;

public class MainNQueen {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String []args)
	{
		int queen;
		System.out.print("Enter number of Queens : ");
		queen=sc.nextInt();
		
		int [][]board =new int[queen][queen];
		
		int startRow=0;
		
		nQueenClass Queen = new nQueenClass();
		boolean result= Queen.nQueen(board,startRow,queen);
		
		if(result==true)
		{
			
		        for (int i = 0; i < queen; i++) {
		            for (int j = 0; j < queen; j++)
		                System.out.print(" " + board[i][j]
		                                 + " ");
		            System.out.println();
		        }
		    
		}
	}
}
