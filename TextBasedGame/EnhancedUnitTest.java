import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests the EnhanceUnit class to see if the methods described there 
 *  work as intended
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.22)
 */
public class EnhancedUnitTest
    extends TestCase
{
    //~ Fields ................................................................
    private EnhancedUnit enhanceUnit;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new EnhancedUnitTest test object.
     */
    public EnhancedUnitTest()
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
        enhanceUnit = new EnhancedUnit("Dezio", 5);
    }

    /**
     * Tests the getSpecialRule method to see it works as desired 
     */
    public void testGetSpecialRule()
    {
        assertThat(enhanceUnit.getSpecialRule()).isEqualTo(null);
    }
    
    /**
     * Tests the setSpecialRule method to see it works as desired 
     */
    public void testSetSpecialRule()
    {
        enhanceUnit.setSpecialRule("No running");
        
        assertThat(enhanceUnit.getSpecialRule()).isEqualTo("No running");
    }
    
    /**
     * Tests the getName method from the parent class to assert that the 
     * information is being transferred to the subclass properly
     */
    public void testGetName()
    {
        assertThat(enhanceUnit.getName()).isEqualTo("Dezio");
    }
    
    /**
     * Tests the getPoints method to see if the information is being
     * transferred properly from the parent class to the subclass
     */
    public void testGetPoints()
    {
        assertThat(enhanceUnit.getPoints()).isEqualTo(5);
    }
    
    /**
     * Tests the toString method to see if it works as intended
     * when there is no special rule.
     */
    public void testToString()
    {
        assertThat(enhanceUnit.toString()).isEqualTo("Dezio (5, 2, 2)");
    }
    
    /**
     * Tests the toString method to see if gives the desired value 
     * when there is a special rule.
     */
    public void testToString2()
    {
        enhanceUnit.setSpecialRule("powah");
        enhanceUnit.addUpgrade(new Upgrade("upgrading", 1));
        String strin = "Dezio (6, 2, 2) upgrades:[upgrading (1)] " +
                       "special rule:[" + enhanceUnit.getSpecialRule() + "]";
        
        assertThat(enhanceUnit.toString()).isEqualTo(strin);
    }
}
