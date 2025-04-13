import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  The test class for the Army class
 *  Testing to see if the methods in the Army class works as intended
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.30)
 */
public class ArmyTest
    extends TestCase
{
    //~ Fields ................................................................
    private Army bigArmy;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new ArmyTest test object.
     */
    public ArmyTest()
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
        bigArmy = new Army("Conquer Army", "Ferocious Beasts", "Zoa");
    }
    
    /**
     * Tests the getPlayerName method to see if it works properly
     * and returns the correct name.
     */
    public void testGetPlayerName()
    {
        assertThat(bigArmy.getPlayerName()).isEqualTo("Zoa");
    }
    
    /**
     * Tests the setPlayerName method to see if the name gets 
     * replaced with the parameter one.
     */
    public void testSetPlayerName()
    {
        bigArmy.setPlayerName("Xer");
        
        assertThat(bigArmy.getPlayerName()).isEqualTo("Xer");
    }
    
    /**
     * Tests the getFaction method to see if it returns the correct
     * faction name.
     */
    public void testGetFaction()
    {
        assertThat(bigArmy.getFaction()).isEqualTo("Ferocious Beasts");
    }
    
    /**
     * Tests the setFaction method to see if it replaces the name
     * with the one in the parameter.
     */
    public void testSetFaction()
    {
        bigArmy.setFaction("cold killers");
        
        assertThat(bigArmy.getFaction()).isEqualTo("cold killers");
    }
    
    /**
     * Tests the toString method to see if it returns the intended
     * statement.
     */
    public void testToString()
    {
        String strin = "player:Zoa, faction:Ferocious Beasts, army:Conquer " +
                        "Army (0, 2, 2) units:[]";
        
        assertThat(bigArmy.toString()).isEqualTo(strin);
    }
    
    

    // ----------------------------------------------------------
    /*# Insert your own test methods here */

}


