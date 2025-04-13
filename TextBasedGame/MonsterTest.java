import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Testing the Monster class to see if it works are desired
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.22)
 */
public class MonsterTest
    extends TestCase
{
    //~ Fields ................................................................
    private Monster scary;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new MonsterTest test object.
     */
    public MonsterTest()
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
        scary = new Monster("Huswurt", 0);
    }
    
    /**
     * Tests the getName method to see if the name is transferred
     * properly from the parent class to the derived class.
     */
    public void testGetName()
    {
        assertThat(scary.getName()).isEqualTo("Huswurt");
    }
    
    /**
     * Tests the getPoints method to see if the points is transferred
     * properly from the parent class to the derived class.
     */
    public void testGetPoints()
    {
        assertThat(scary.getPoints()).isEqualTo(0);
    }
    
    /**
     * Tests the setQuality() method to see if the quality is changed 
     * properly from the parent class to the derived class.
     */
    public void testSetQuality()
    {
        assertThat(scary.getQuality()).isEqualTo(4);
    }
    
    /**
     * Tests the setDefense method to see if the defense is changed
     * properly from the parent class to the derived class.
     */
    public void testSetDefense()
    {
        assertThat(scary.getDefense()).isEqualTo(4);
    }

    // ----------------------------------------------------------
    /*# Insert your own test methods here */

}
