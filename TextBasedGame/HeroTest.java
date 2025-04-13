import student.micro.*;
import static org.assertj.core.api.Assertions.*;

// -------------------------------------------------------------------------
/**
 *  Tests if the constructors made in the Hero class works as expected
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.22)
 */
public class HeroTest
    extends TestCase
{
    //~ Fields ................................................................
    private Hero hero;
  
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new HeroTest test object.
     */
    public HeroTest()
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
        hero = new Hero("Guts", 3);
    }
    
    /**
     * Tests the getName method to see if the information is transferred
     * properly from the parent class to the derived class.
     */
    public void testGetName()
    {
        assertThat(hero.getName()).isEqualTo("Guts");
    }
    
    /**
     * Tests the getPoints method to see if the information is transferred
     * properly from the parent class to the derived class.
     */
    public void testGetPoints()
    {
        assertThat(hero.getPoints()).isEqualTo(3);
    }
    
    /**
     * Tests the setQuality() method to see if the quality is changed 
     * properly from the parent class to the derived class.
     */
    public void testSetQuality()
    {
        assertThat(hero.getQuality()).isEqualTo(5);
    }
    
    /**
     * Tests the setDefense method to see if the defense is changed
     * properly from the parent class to the derived class.
     */
    public void testSetDefense()
    {
        assertThat(hero.getDefense()).isEqualTo(5);
    }

}
