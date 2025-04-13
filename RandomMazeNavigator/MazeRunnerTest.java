import student.micro.*;
import student.micro.jeroo.*;
import static org.assertj.core.api.Assertions.*;
import static student.micro.jeroo.CompassDirection.*;
import static student.micro.jeroo.RelativeDirection.*;
//----------------------------------------------------------------------------
/**
 * Introductory CS 1114 class
 * focusing on wirting tests and create solutions using loops and variables
 * 
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.02.15)
 */
public class MazeRunnerTest
    extends TestCase
{
    //~ Fields ................................................................
    private MazeRunner bob;
    private TestingIsland island;
    

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new MazeRunnerTest test object.
     */
    public MazeRunnerTest()
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
        /*# Insert your own setup code here */
        island = new TestingIsland();
        bob = new MazeRunner();
        //island.addObject(bob, 1, 1);
        
        
        
    }


    // ----------------------------------------------------------
    /**
     *  Tests the clerMaze method
     */
    public void testClearMaze()
    {
        island.addObject(bob, 1, 1);
        
        bob.clearMaze();
        
        assertThat(bob.getX()).isEqualTo(1);
        assertThat(bob.getY()).isEqualTo(1);
        assertThat(island.countFlowers()).isEqualTo(0);
        assertThat(island.countNets()).isEqualTo(0);
        
        
      
    }
    
    /**
     *  Tests the first three if statements in the 
     *  disableNetsAndFlowers method
     */
    public void testSeesFlowerHereAndAhead()
    {
        island.addObject(new Flower(), 2, 1);
        island.addObject(new Flower(), 1, 1);
        island.addObject(new Flower(), 1, 2);
        island.addObject(bob, 1, 1);
        
        bob.disableNetsAndFlowers();
        
        assertThat(bob.getX()).isEqualTo(1);
        assertThat(bob.getY()).isEqualTo(1);
        assertThat(island.countFlowers()).isEqualTo(0);
    }         
    
    /**
     *  Tests if the jeroo can disable nets in the disableNetsAndFlowers
     *  method
     */
    public void testDisablingNets()
    {
        island.addObject(bob, 9, 7);
        island.addObject(new Net(), 10, 7);
        
        bob.disableNetsAndFlowers();
        
        assertThat(bob.getX()).isEqualTo(1);
        assertThat(bob.getY()).isEqualTo(1);
        assertThat(island.countNets()).isEqualTo(0);
    }
    
    /**
     *  Tests if the jeroo hops and calls pathChange and clearMaze in the 
     *  disableNetsAndFlowers method 
     */
    public void testDoesNotSeeWater()
    {
        island.addObject(bob, 5, 3);
        
        bob.disableNetsAndFlowers();
        
        assertThat(bob.getX()).isEqualTo(1);
        assertThat(bob.getY()).isEqualTo(1);
    }
    
    /**
     * Test if the jeroo can turn left and clear maze when it sees water ahead
     * and right 
     */
    public void testWaterAheadAndRight()
    {
        island.addObject(bob, 10, 5);
        
        bob.hugWater();
        
        assertThat(bob.getX()).isEqualTo(1);
        assertThat(bob.getY()).isEqualTo(1);
        assertThat(bob.getHeading()).isEqualTo(NORTH);
        
        
    }
    
    /**
     * Tests if the jeroo can turn right when it sees water ahead and left
     */
    public void testWaterLeftAndAhead()
    {
        island.addObject(bob, 10, 1);
        
        bob.hugWater();
        
        assertThat(bob.getX()).isEqualTo(1);
        assertThat(bob.getY()).isEqualTo(1);
        assertThat(bob.getHeading()).isEqualTo(NORTH);
    }
    
    /**
     * Tests if the jeroo can turn left when it sees water on ahead and when
     * it is also clear ahead.
     */
    public void testWaterAndClear()
    {
        island.addObject(bob, 8, 4);
        
        bob.hugWater();
        
        assertThat(bob.getX()).isEqualTo(1);
        assertThat(bob.getY()).isEqualTo(1);
        assertThat(bob.getHeading()).isEqualTo(NORTH);
    }
    
    /**
     * Tests if the jeroo can change path when it is clear left and clear
     * the maze
     */
    public void testPathChange()
    {
        island.addObject(bob, 7, 3);
        bob.pathChange();
        
        assertThat(bob.getX()).isEqualTo(1);
        assertThat(bob.getY()).isEqualTo(1);
        assertThat(bob.getHeading()).isEqualTo(NORTH);
    }  
}
