import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import student.tetris2.*;

// -------------------------------------------------------------------------
/**
 *  Tests cases for the StudentBoard class.
 *  Testing the methods in the StudentBoard class to see it they work as
 *  intended.
 *
 *  @author Aashish Ganeshkumar (aashishg15)
 *  @version (2022.04.15)
 */
public class StudentBoardTest
    extends TestCase
{
    //~ Fields ................................................................
    private Board tetrisBoard;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new StudentBoardTest test object.
     */
    public StudentBoardTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        tetrisBoard = new StudentBoard(4, 10);
    }
    
    /**
     * Tests the getWidth method to see if it returns the intended
     * value.
     */
    public void testGetWidth()
    {
        assertThat(tetrisBoard.getWidth()).isEqualTo(4);
    }
    
    /**
     * Tests the getHeight method to see if it returns the intended
     * value.
     */
    public void testGetHeight()
    {
        assertThat(tetrisBoard.getHeight()).isEqualTo(10);
    }
    
    /**
     * Tests the getColumnHeights method to see if it returns the intended
     * value.
     */
    public void testGetColumnHeights()
    {
        assertThat(tetrisBoard.getColumnHeights().length).isEqualTo(4);
    }
    
    /**
     * Tests the getBlocksInAllRow method to see if it returns the intended
     * value.
     */
    public void testGetBlocksInAllRow()
    {
        assertThat(tetrisBoard.getBlocksInAllRows().length).isEqualTo(10);
    }
    
    /**
     * Tests the place method to see if the Board.PLACE_ROW_FILLED
     * statement of the place method works as intended.
     */
    public void testPlace()
    {
        StudentBoard start = BoardUtilities.newBoard(StudentBoard.class,
            10, 24,
            "#### #####");
        Piece pieces = Piece.getPiece(Piece.STICK, 0);
        int result = start.place(pieces, new Point(4, 0));
        
        assertThat(result).isEqualTo(Board.PLACE_ROW_FILLED);
        
        StudentBoard expected = BoardUtilities.newBoard(StudentBoard.class,
            10, 24,
            "    #   ",
            "    #   ",
            "    #   ",
            "##########");
        assertThat(BoardUtilities.equals(start, expected)).isTrue();
            
    }
    
    /**
     * Tests the place method to see if the Board.PLACE_OUT_BOUNDS 
     * statement of the place method works as intended.
     */
    public void testPlace2()
    {
        StudentBoard start = BoardUtilities.newBoard(StudentBoard.class,
            10, 24,
            "#### #####");
        Piece pieces = Piece.getPiece(Piece.STICK, 0);
        int result = start.place(pieces, new Point(-3, 0));
        System.out.println(result);
       
        assertThat(result).isEqualTo(Board.PLACE_OUT_BOUNDS);
        
         
    }
    
    /**
     * Tests the place method to see if the Board.PLACE_OUT_BOUNDS 
     * statement of the place method works as intended.
     */
    public void testPlace3()
    {
        StudentBoard start = BoardUtilities.newBoard(StudentBoard.class,
            10, 24,
            "#### #####");
        Piece pieces = Piece.getPiece(Piece.STICK, 0);
        int result = start.place(pieces, new Point(0, -2));
        System.out.println(result);
       
        assertThat(result).isEqualTo(Board.PLACE_OUT_BOUNDS); 
    }
    
    /**
     * Tests the place method to see if the Board.PLACE_OUT_BOUNDS 
     * statement of the place method works as intended when the x value
     * is out of bounds.
     */
    public void testPlace4()
    {
        StudentBoard start = BoardUtilities.newBoard(StudentBoard.class,
            10, 24,
            "#### #####");
        Piece pieces = Piece.getPiece(Piece.STICK, 0);
        int result = start.place(pieces, new Point(14, 0));
        System.out.println(result);
       
        assertThat(result).isEqualTo(Board.PLACE_OUT_BOUNDS);  
    }
    
    /**
     * Tests the place method to see if the Board.PLACE_OUT_BOUNDS 
     * statement of the place method works as intended.
     */
    public void testPlace5()
    {
        StudentBoard start = BoardUtilities.newBoard(StudentBoard.class,
            10, 24,
            "#### #####");
        Piece pieces = Piece.getPiece(Piece.STICK, 0);
        int result = start.place(pieces, new Point(2, 21));
        System.out.println(result);
       
        assertThat(result).isEqualTo(Board.PLACE_OUT_BOUNDS); 
    }
    
    /**
     * Tests the place method to see if the Board.PLACE_OK statement of
     * the place method works as intended.
     */
    public void testPlace6()
    {
        StudentBoard start = BoardUtilities.newBoard(StudentBoard.class,
            10, 24,
            "####  ####");
        Piece pieces = Piece.getPiece(Piece.STICK, 0);
        int result = start.place(pieces, new Point(4, 0));
        
        assertThat(result).isEqualTo(Board.PLACE_OK);
        
        StudentBoard expected = BoardUtilities.newBoard(StudentBoard.class,
            10, 24,
            "    #   ",
            "    #   ",
            "    #   ",
            "##### ####");
            
        assertThat(BoardUtilities.equals(start, expected)).isTrue();
    }
    
    /**
     * Tests the place method to see if the Board.PLACE_BAD statement of
     * the place method works as intended.
     */
    public void testPlace7()
    {
        StudentBoard start = BoardUtilities.newBoard(StudentBoard.class,
            10, 24,
            "#### #####");
        Piece pieces = Piece.getPiece(Piece.STICK, 0);
        int result = start.place(pieces, new Point(2, 0));
        
        assertThat(result).isEqualTo(Board.PLACE_BAD); 
    }
    
    /**
     * Tests the clearRows method to see if it clears the row when the 
     * row is filled.
     */
    public void testClearRows()
    {
        StudentBoard start = BoardUtilities.newBoard(StudentBoard.class,
            10, 24,
            "##########");
            
        assertThat(start.clearRows()).isEqualTo(true);
        
    }

    /**
     * Tests the clearRows method to see if it clears the row when the
     * row is not full.
     */
    public void testClearRows2()
    {
        StudentBoard start = BoardUtilities.newBoard(StudentBoard.class,
            10, 24,
            "## #######");
    
        assertThat(start.clearRows()).isEqualTo(false);
    }
    // ----------------------------------------------------------
    /*# Insert your own test methods here */

}
