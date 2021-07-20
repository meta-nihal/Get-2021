import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class nQueenTest {
	
	private int dimensionOfBoard;
	private int board[][];
	private int startRow;
	private boolean expectedOutput;
	private int queen;
	//private int[][] expectedBoard;

	public nQueenTest(int[][] board, int startRow,int queen, boolean expectedOutput) {
        this.board = board;
        this.startRow = startRow;
      //  this.dimensionOfBoard = dimensionOfBoard;
        this.expectedOutput = expectedOutput;
      //  this.expectedBoard = expectedBoard;
    }
	
	 @Parameterized.Parameters
     /*public static Collection<Object[]> input() {
    	 
         return Arrays.asList(new Object[][]
                	 {
                         new int[][] {
                             {0, 0, 0, 0},
                             {0, 0, 0, 0},
                             {0, 0, 0, 0},
                             {0, 0, 0, 0}                            
                         },
                         0,
                         4,
                         true
                     });
                     
                     
                 }
         
     */
	
	@Test
    public void testNQueen() {
        boolean actualOutput = nQueenClass.nQueen(new int[][] {
         {0, 0, 0, 0},
         {0, 0, 0, 0},
         {0, 0, 0, 0},
         {0, 0, 0, 0}                            
     },0,4);
        assertEquals(actualOutput ,true);
        
        
    }
}
