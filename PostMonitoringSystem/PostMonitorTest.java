import student.micro.*;
import static org.assertj.core.api.Assertions.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Aashish Ganeshkumar (906370814)
//-------------------------------------------------------------------------
// -------------------------------------------------------------------------
/**
 * This is a test class for the PostMonitor class to see if it all the 
 * methods work as intended.
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.04)
 */
public class PostMonitorTest
    extends TestCase
{
    //~ Fields ................................................................
    private PostMonitor detector;
    private Post post;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new PostMonitorTest test object.
     */
    public PostMonitorTest()
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
        detector = new PostMonitor();
        post = new Post("Tony", "you are not the father", 4, 19);
        /*# Insert your own setup code here */
    }
    
    /**
     * Tests the getPostCount method to see if it works as intended. 
     */
    public void testGetPostCount()
    {
        assertThat(detector.getPostCount()).isEqualTo(0);
    }
    
    /**
     * Tests the getHourCounts method to see if it returns the intended
     * value.
     */
    public void testGetHourCounts()
    {
        int[] hourly = new int[24];
        
        assertThat(detector.getHourCounts()).isEqualTo(hourly);
        
    }
    
    /**
     * Tests the getDayCounts method to see if it returns the intended
     * value.
     */
    public void testDayCounts()
    {
        int[] lowDays = new int[7];
        
        assertThat(detector.getDayCounts()).isEqualTo(lowDays);
    }
    
    /**
     * Tests the record post method to see if it works as intended.
     */
    public void testRecordPost()
    {
        detector.recordPost(post);
        
        assertThat(detector.getHourCounts()[19]).isEqualTo(1);
        assertThat(detector.getDayCounts()[4]).isEqualTo(1);
        assertThat(detector.getPostCount()).isEqualTo(1);
    }
    
    /**
     * Tests the getIndexOfLargest method to see if the array can look and 
     * grab the large value.
     */
    public void testGetIndexOfLargest()
    {
        int[] array = {1, 2, 3, 5, 9, 6, 4};
        
        assertThat(detector.getIndexOfLargest(array)).isEqualTo(4);
    }
    
    /**
     * Tests the getBusiestHour method to see if it returns the proper
     * value.
     */
    public void testGetBusiestHour()
    {
        detector.recordPost(post);
        
        assertThat(detector.getBusiestHour()).isEqualTo(19);
    }
    
    /**
     * Tests the getBusiestDay method to see if it returns the proper 
     * value.
     */
    public void testGetBusiestDay()
    {
        detector.recordPost(post);
        
        assertThat(detector.getBusiestDay()).isEqualTo(4);
    }
    
    /**
     * Tests the getIndexOfSmallest method to see if it works as properly
     * and returns the smallest index value from the array.
     */
    public void testGetIndexOfSmallest()
    {
        int[] array = {1, 2, 3, 6, 7, 5, 9};
        
        assertThat(detector.getIndexOfSmallest(array)).isEqualTo(0);
        
        
    }
    
    /**
     * Tests the getSlowestHour method to see if it works as intended.
     */
    public void testGetSlowestHour()
    {
        detector.recordPost(post);
        
        assertThat(detector.getSlowestHour()).isEqualTo(0);
    }
    
    /**
     * Tests the getSlowestDay method to see if it returns the intended value
     */
    public void testGetSlowestDay()
    {
        detector.recordPost(post);
        
        assertThat(detector.getSlowestDay()).isEqualTo(0);
    }

    // ----------------------------------------------------------
    /*# Insert your own test methods here */

}
