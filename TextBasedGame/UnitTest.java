import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import java.util.*;

// -------------------------------------------------------------------------
/**
 *  Tests the Unit class to see if the methods work as intended
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.22)
 */
public class UnitTest
    extends TestCase
{
    //~ Fields ................................................................
    private Unit unit;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new UnitTest test object.
     */
    public UnitTest()
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
        unit = new Unit("BlackBeard", 0);
    }
    
    /**
     * Tests the getName method to see if it works as intended.
     */
    public void testGetName()
    {
        assertThat(unit.getName()).isEqualTo("BlackBeard");
    }
    
    /**
     * Tests the setName method to see if it changes the name of unit to 
     * the parameter name
     */
    public void testSetName()
    {
        unit.setName("Clur");
        
        assertThat(unit.getName()).isEqualTo("Clur");
        
        
    }
    
    /**
     * Tests the getPoints method to see if it works as intended.
     */
    public void testGetPoints()
    {
        assertThat(unit.getPoints()).isEqualTo(0);
    }
    
    /**
     * Tests the getPoints method to see if it changes the points to the 
     * desired one when there are multiple points.
     */
    public void testGetPoints2()
    {
        Upgrade upgrade = new Upgrade("powah", 2);
        Upgrade secondUpgrade = new Upgrade("fire", 3);
        
        unit.addUpgrade(upgrade);
        unit.addUpgrade(secondUpgrade);
        
        assertThat(unit.getPoints()).isEqualTo(5);
        
        
    }
    
    /**
     * Tests the setPoint() method to see if the points are changed to one
     * in the parameter value.
     */
    public void testSetPoints()
    {
        unit.setPoints(4);
        
        assertThat(unit.getPoints()).isEqualTo(4);
    }
    
    /**
     * Tests the getQuality method to see if it works as intended.
     */
    public void testGetQuality()
    {
        assertThat(unit.getQuality()).isEqualTo(2);
    }
    
    /**
     * Tests the setQuality method to see if it changes the quality to what 
     * was described in the parameter value.
     */
    public void testSetQuality()
    {
        unit.setQuality(4);
        
        assertThat(unit.getQuality()).isEqualTo(4);
        
    }
    
    /**
     * Tests the getDefense method to see if it works as intended.
     */
    public void testGetDefense()
    {
        assertThat(unit.getDefense()).isEqualTo(2);
    }
    
    /**
     * Tests the setDefense method to see if it changes the defense
     * value.
     */
    public void testSetDefense()
    {
        unit.setDefense(4);
        
        assertThat(unit.getDefense()).isEqualTo(4);
    }
    
    /**
     * Tests the getUpgrades method to see if the list is returned properly
     * with all the proper upgrades.
     */
    public void testGetUpgrades()
    {
        Upgrade upgrade = new Upgrade("blaze", 5);
        List<Upgrade> upgrades = new ArrayList<Upgrade>();
        upgrades.add(upgrade);
        unit.addUpgrade(upgrade);
        
        assertThat(unit.getUpgrades()).isEqualTo(upgrades);
    }
    
    /**
     * Tests the addUpgrade method to see if the upgrade is added properly.
     */
    public void testAddUpgrade()
    {
        Upgrade upgrade = new Upgrade("water", 1);
        Upgrade secondUpgrade = new Upgrade("tsunami", 3);
        
        unit.addUpgrade(upgrade);
        unit.addUpgrade(secondUpgrade);
        
        assertThat(unit.getUpgrades().size()).isEqualTo(2);
    }
    
    /**
     * Tests the removeUpgrade method to see if the upgrade is removed
     * properly.
     */
    public void testRemoveUpgrade()
    {
        Upgrade upgrade = new Upgrade("fiery", 1);
        Upgrade secondUpgrade = new Upgrade("invincible", 2);
        
        unit.addUpgrade(upgrade);
        unit.addUpgrade(secondUpgrade);
        unit.removeUpgrade(upgrade);
        
        assertThat(unit.getUpgrades().size()).isEqualTo(1);
    }
    
    /**
     * Tests the toString method to see if the first if statement
     * works as intended.
     */
    public void testToString()
    {
        assertThat(unit.toString()).isEqualTo("BlackBeard (0, 2, 2)");
    }
    
    /**
     * Tests the toString method to see if the second if statement
     * works as intended.
     */
    public void testToString2()
    {
        Upgrade upgrade = new Upgrade("power", 4);
        unit.addUpgrade(upgrade);
        
        assertThat(unit.toString()).isEqualTo("BlackBeard (4, 2, 2)" +
                                        " upgrades:[power (4)]");
    }
}
