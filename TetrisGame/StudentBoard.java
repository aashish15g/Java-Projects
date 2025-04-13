import student.tetris2.*;
//-------------------------------------------------------------------------
/**
 *  StudentBoard class which is the outline for setting up the board.
 *  StudentBoard class implements Board
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.04.15)
 */
public class StudentBoard
    implements Board 
{
    //~ Fields ................................................................
    private int width;
    private int height;
    private int[] columnHeights;
    private int[] blocksInAllRows;
    private boolean[][] grid;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created StudentBoard object.
     * @param width Width of board.
     * @param height Height of board.
     */
    public StudentBoard(int width, int height)
    {
        super();
        this.width = width;
        this.height = height;
        this.columnHeights = new int[this.width];
        this.blocksInAllRows = new int[this.height];
        this.grid = new boolean[height][width];
        /*# Do any work to initialize your class here. */
    }
    
     /**
     * Returns the width of the board in blocks.
     * @return Returns width.
     */
    public int getWidth()
    {
        return this.width;
    }
    
    /**
     * Returns the height of the board in blocks
     * @return Returns height.
     */
    public int getHeight()
    {
        return this.height;
    }
    
    /**
     * Returns an array of the heights of all columns, which is
     * the y value of the highest block + 1 in each column.
     * The height is 0 if the column contains no blocks.
     *
     * @return an array of the column heights for all columns.
     */
    public int[] getColumnHeights()
    {
        return this.columnHeights;
    }
    
     /**
     * Returns an array with one entry per row indicating the number of filled
     * blocks in the given row.
     *
     * @return An array representing the number of blocks filled in each row.
     */
    public int[] getBlocksInAllRows()
    {
        return this.blocksInAllRows;
    }
    
    /**
     * Returns true if the given block is filled in the board.
     * Blocks outside of the valid width/height area
     * always return true.
     *
     * @param points The location to check.
     * @return True if there is a block at the specified (x, y) position.
     */
    public boolean hasBlockAt(Point points)
    {
        int x = points.getX();
        int y = points.getY();
        return grid[y][x];
    }
    
    /**
     * Attempts to add the body of a piece to the board.
     * Copies the piece blocks into the board grid.
     * Returns PLACE_OK for a regular placement, or PLACE_ROW_FILLED
     * for a regular placement that causes at least one row to be filled.
     *
     * Error cases:
     * If part of the piece would fall out of bounds, the placement
     * does not change the board at all, and PLACE_OUT_BOUNDS is returned.
     * If the placement is "bad"--interfering with existing blocks in the
     * grid--then the placement is halted partially complete and PLACE_BAD
     * is returned.
     * @param pieces Parameter that gives the type of piece.
     * @param dot Parameter that gives the location of piece.
     * @return Returns a value based on the how the piece is positioned.
     */
    public int place(Piece pieces, Point dot)
    {
        Point[] blocks = pieces.getBody();
        int allWidth = pieces.getWidth() + dot.getX();
        int allHeight = pieces.getHeight() + dot.getY();
        for (int i = 0; i < blocks.length; i++)
        {
            int x = dot.getX() + blocks[i].getX();
            int y = dot.getY() + blocks[i].getY();
            if (allWidth > this.getWidth() || allHeight > this.getHeight()
                || x < 0 || y < 0)
            {
                return Board.PLACE_OUT_BOUNDS;
            }
            else if (hasBlockAt(new Point(x, y)))
            {
                return Board.PLACE_BAD;
            }
            else 
            {
                grid[y][x] = true;
                if (y + 1 > columnHeights[x])
                {
                    columnHeights[x] = y + 1;
                }
                blocksInAllRows[y] += 1;
            }
        }
        
        for (int i = 0; i < blocksInAllRows.length; i++)
        {
            if (blocksInAllRows[i] == this.width)
            {
                return Board.PLACE_ROW_FILLED;
            }
        }
        return Board.PLACE_OK;
    }
    
    /**
     * Method which is a part of the clearRows method. Checks to see if the 
     * row is filled.
     * @param rows Paramter for the row to check.
     * @return Returns true when the row is filled.
     */
    public boolean rowFiller(int rows)
    {
        for (int i = 0; i < this.getWidth(); i++)
        {
            if (!grid[rows][i])
            {
                return false;  
            }
        }
        return true;
    }
    
    /**
     * Method which gets rid of the rows that are already filled.
     * @return Returns true when the row is cleared.
     */
    public boolean clearRows()
    {
        boolean rowCleared = false;
        
        for (int  i = 0; i < blocksInAllRows.length; i++)
        {
            if (rowFiller(i))
            {
                blocksInAllRows[i] = 0;
                for (int a = 0; a < this.getWidth(); a++)
                {
                    columnHeights[a]--;
                    grid[i][a] = false;
                }
                rowCleared = true;
            }
        }
        return rowCleared;
    }
    
    /**
     * Method which shows the two dimensional array of the board
     * @return returns the two dimensional array of the pieces on the board.
     */
    public boolean[][] getGrid()
    {
        return grid;
    }
}

