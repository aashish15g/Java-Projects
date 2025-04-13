import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import java.util.*;
// -------------------------------------------------------------------------
/**
 *  Test class for the Squad class
 *  Testing if all the methods in the Squad class works as intended
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.30)
 */
public class SquadTest
    extends TestCase
{
    //~ Fields ................................................................
    private Squad squaaa;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new SquadTest test object.
     */
    public SquadTest()
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
        squaaa = new Squad("Squaaaa Fighters");
    }
    
    /**
     * Tests the getUnits method to see if it returns the desired
     * amount.
     */
    public void testGetUnits()
    {
        Unit unit = new Unit("powah", 5);
        List<Unit> units = new ArrayList<Unit>();
        units.add(unit);
        squaaa.addUnit(unit);
        
        assertThat(squaaa.getUnits()).isEqualTo(units);
    }
    
    /**
     * Tests the addUnit method to see if the unit is correctly
     * added to the list.
     */
    public void testAddUnit()
    {
        Unit unit = new Unit("lory", 5);
        Unit secondUnit = new Unit("yol", 4);
        squaaa.addUnit(unit);
        squaaa.addUnit(secondUnit);
        
        
        assertThat(squaaa.getUnits().size()).isEqualTo(2);
    }
    
    /**
     * Tests the removeUnit method to see if the unit is removed
     * properly.
     */
    public void testRemoveUnit()
    {
        Unit unit = new Unit("Wur", 2);
        Unit secondUnit = new Unit("tur", 3);
        squaaa.addUnit(unit);
        squaaa.addUnit(secondUnit);
        squaaa.removeUnit(unit);
        
        assertThat(squaaa.getUnits().size()).isEqualTo(1);
    }
    
    /**
     * Tests the getPoints method to see if it returns the desired
     * amount of points.
     */
    public void testGetPoints()
    {
        assertThat(squaaa.getPoints()).isEqualTo(0);
    }
    
    /**
     * Tests the getPoints method to see if it returns the intended
     * amount of points when there are multiple units with points.
     */
    public void testGetPoints2()
    {
        Unit unit = new Unit("Zoroah", 4);
        Unit secondUnit = new Unit("Wurs", 3);
        
        squaaa.addUnit(unit);
        squaaa.addUnit(secondUnit);
        
        assertThat(squaaa.getPoints()).isEqualTo(7);
    }
    
    /**
     * Tests the toString method to see if a unit was added as 
     * intended.
     */
    public void testToString()
    {
        Unit unit = new Unit("Zora", 4);
        
        squaaa.addUnit(unit);
        String strin = "Squaaaa Fighters (4, 2, 2) units:[Zora (4, 2, 2)]";
        assertThat(squaaa.toString()).isEqualTo(strin);
    }
    
    /**
     * Tests the toString method to see if both the units were 
     * added as intended.
     */
    public void testToString2()
    {
        Unit unit = new Unit("pol", 4);
        Unit secondUnit = new Unit("eux", 3);
        squaaa.addUnit(unit);
        squaaa.addUnit(secondUnit);
        squaaa.setSpecialRule("power");
       
        String strin = "Squaaaa Fighters (7, 2, 2) special rule:[power]" + 
                      " units:[pol (4, 2, 2), eux (3, 2, 2)]";
        assertThat(squaaa.toString()).isEqualTo(strin);
    }
    
    
    

    // ----------------------------------------------------------
    /*# Insert your own test methods here */

}
