import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Testing the Upgrade class to see if it works are desired
 *  Test objectives are to make sure the getter and setter methods
 *  inputed in the Upgrade class works properly
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.22)
 */
public class UpgradeTest
    extends TestCase
{
    //~ Fields ................................................................
    private Upgrade upgrader;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new UpgradeTest test object.
     */
    public UpgradeTest()
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
        upgrader = new Upgrade("Upgrades", 1);
    }
    
    /**
     * Tests the getName method to see if the name is transferred
     * properly from the parent class to the derived class.
     */
    public void testGetName()
    {
        assertThat(upgrader.getName()).isEqualTo("Upgrades");
    }
     
    /**
     * Tests the setName method to see whether it changes the name of the 
     * String 
     */
    public void testSetName()
    {
        upgrader.setName("Pow Pow Upgrades!");
        
        assertThat(upgrader.getName()).isEqualTo("Pow Pow Upgrades!");
    }
    
    /**
     * Tests the getPoints method to see if it works as intended
     */
    public void testGetPoints()
    {
        assertThat(upgrader.getPoints()).isEqualTo(1);
    }
    
    /**
     * Tests the setPoints method to see whether it changes the points
     * properly
     */
    public void testSetPoints()
    {
        upgrader.setPoints(4);
        
        assertThat(upgrader.getPoints()).isEqualTo(4);
    }
    
    /**
     * Tests the toString method to see if it returns the intended
     * statement.
     */
    public void testToString()
    {
        assertThat(upgrader.toString()).isEqualTo("Upgrades (1)");
    }
    // ----------------------------------------------------------
    /*# Insert your own test methods here */

}
