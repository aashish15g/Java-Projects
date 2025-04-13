import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import student.media.*;
import java.awt.Color;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Aashish Ganeshkumar (906370814)
// -------------------------------------------------------------------------
/**
 *  Introductory CS 1114 class teaching us the principles of Java
 *  Test objective are to check is the methods are working as desired
 *  to complete the objective of the program
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.01)
 */
public class SchellingSimulationTest
    extends TestCase
{
    //~ Fields ................................................................
    private SchellingSimulation schellingSim;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new SchellingSimulationTest test object.
     */
    public SchellingSimulationTest()
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
        schellingSim = new SchellingSimulation(2, 2);
    }
    
    /**
     * Tests the getSatisfactionThreshold method to see if it is set to 
     * desired range 
     */
    public void testGetSatisfactionThreshold()
    {
        assertThat(schellingSim.getSatisfactionThreshold()).
            isEqualTo(0.3, within(0.01));
    }
    
    /**
     * Tests the getRedLine method to check if it returns red line 
     */
    public void testGetRedLine()
    {
        assertThat(schellingSim.getRedLine()).isEqualTo(0);
    }
    
    /**
     * Tests the setRedLine method to see if it returns a specificed 
     * red line value 
     */
    public void testSetRedLine()
    {
        schellingSim.setRedLine(0);
        assertThat(schellingSim.getRedLine()).isEqualTo(0);
    }
    
    /**
     * Tests the populate method to see if it populates the map with pixels 
     */
    public void testPopulate()
    {
        schellingSim.populate(0.00, 0.00);
        assertThat(schellingSim.getRedLine()).isEqualTo(0);
    }
    
    /**
     * Tests the areSameColor method to see if it compares two pixels 
     */
    public void testAreSameColor()
    {
        boolean result = schellingSim.areSameColor(
            schellingSim.getPixel(0, 0), schellingSim.getPixel(0, 1));
        
        assertThat(result).isEqualTo(true);
    }
    
    /**
     * Tests the isEmpty method to see if it checks places where the
     * pixels are white 
     */
    public void testIsEmpty()
    {
        boolean result = 
            schellingSim.isEmpty(schellingSim.getPixel(0, 0));
        
        assertThat(result).isTrue();
    }
    
    /**
     * Tests the isSatisfied method to see if the pixels are in a place 
     * where the agent is satisfied
     */
    public void testIsSatified()
    {
        boolean result = 
            schellingSim.isSatisfied(schellingSim.getPixel(0, 0), 
            Color.ORANGE);
        
        assertThat(result).isEqualTo(true);
    }
    
    /**
     * Tests the maybeRelocate method to see if it moves the pixels
     * if they are in an unsatisfied position 
     */
    public void testMaybeRelocate()
    {
        boolean result = schellingSim.maybeRelocate(
            schellingSim.getPixel(0, 0));
        
        assertThat(result).isEqualTo(true);
    }
    
    /**
     * Tests the cycleAgents method to move the agents when they are 
     * unsatisfied
     */
    public void testCycleAgents()
    {
        assertThat(schellingSim.cycleAgents()).isEqualTo(0); 
    }
    // ----------------------------------------------------------
    /*# Insert your own test methods here */

}
