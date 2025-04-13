// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Aashish Ganeshkumar (906370814)
//-------------------------------------------------------------------------
//-------------------------------------------------------------------------
/**
 *  The postMonitor class which was made with the purpose to monitor 
 *  and keep information about the posts.
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.04)
 */
public class PostMonitor
{
    //~ Fields ................................................................
    private int postCount;
    private int[] hourCounts;
    private int[] dayCounts;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created PostMonitor object.
     */
    public PostMonitor()
    {
        super();
        this.postCount = 0;
        this.hourCounts = new int[24];
        this.dayCounts = new int[7];
        /*# Do any work to initialize your class here. */
    }
    
    /**
     * Getter method which returns postCount.
     * @return Returns postCount.
     */
    public int getPostCount()
    {
        return this.postCount;
    }
    
    /**
     * Getter method which shows us the hourCounts/
     * @return Returns the hourCounts.
     */
    public int[] getHourCounts()
    {
        return this.hourCounts;
    }
    
    /**
     * Getter method which shows us the getDayCounts array.
     * @return Returns the getDayCounts array.
     */
    public int[] getDayCounts()
    {
        return this.dayCounts;
    }
    
    /**
     * This method takes a single Post as a parameter. It does not 
     * return a value. It "records" seeing the post by incrementing 
     * the hour count for the hour when the post was published, and also 
     * incrementing the day count for the day when the post was published. 
     * It also increments the post count.
     * @param posted Thee param taken from the other class.
     */
    public void recordPost(Post posted)
    {
        hourCounts[posted.getHour()] += 1;
        dayCounts[posted.getDay()] += 1;
        postCount++;
        
    }
    
    /**
     * This method takes an integer array as a parameter and returns an 
     * integer representing the index (position) in the array where the 
     * largest value in the array appears. 
     * @param array The parameter that takes in an array and looks for the 
     * largest int value.
     * @return Returns the largest array number.
     */
    public int getIndexOfLargest(int[] array)
    {
        int largestIntInd = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > array[largestIntInd])
            {
                largestIntInd = i;
            }
        }
        return largestIntInd;
    }
        
    /**
     * This method takes no parameters and returns an integer 
     * representing the hour (0-23) with the largest count. You can 
     * implement it in one line using getIndexOfLargest().
     * @return Returns the biggest hour count.
     */
    public int getBusiestHour()
    {
        return this.getIndexOfLargest(this.getHourCounts());
    }
    
    /**
     * This method takes no parameters and returns an integer 
     * representing the day (0-6) with the largest count. You can also 
     * implement this in one line.
     * @return Returns the biggest day count.
     */
    public int getBusiestDay()
    {
        return this.getIndexOfLargest(this.getDayCounts());
    }
    
    /**
     * This method takes an integer array as a parameter and returns an 
     * integer representing the index (position) in the array where the 
     * smallest value in the array appears. To implement this method, 
     * you can use the same techniques as for getIndexOfLargest(). If 
     * more than one array slot contains the same smallest value, 
     * return the lowest index with that value 
     * (the first one found, if searching from the beginning of the array)
     * @param array Parameter that looks through the array for the 
     * smallest number.
     * @return Returns the smallest array number.
     */
    public int getIndexOfSmallest(int[] array)
    {
        int smallIntIndex = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < array[smallIntIndex])
            {
                smallIntIndex = i;
            }
        }
        return smallIntIndex;
    }
       
    /**
     * This method takes no parameters and returns an integer 
     * representing the hour (0-23) with the smallest count. You can 
     * implement it in one line like before.
     * @return Returns the lowest hour count.
     */
    public int getSlowestHour()
    {
        return this.getIndexOfSmallest(this.getHourCounts());
    }
    
    /**
     * This method takes no parameters and returns an integer representing 
     * the day (0-6) with the smallest count. You can also implement this 
     * in one line.
     * @return Returns the smallest count.
     */
    public int getSlowestDay()
    {
        return this.getIndexOfSmallest(this.getDayCounts());
    }
}
    
    
    
       //~ Methods .............................................................