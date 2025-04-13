// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Aashish Ganeshkumar (906370814)
//-------------------------------------------------------------------------
/**
 *  The Post class which is meant to display a post.
 *  The objective of this class is to display a single post.
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.04)
 */
public class Post
{
    //~ Fields ................................................................
    private String name;
    private String message;
    private int day;
    private int hour;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Post object.
     * @param name Parameter that takes the name of the string.
     * @param message Paramter that holds the string message.
     * @param day Parameter that takes an int value representing the day.
     * @param hour Parameter that takes an int value representing the hour.
     */
    public Post(String name, String message, int day, int hour)
    {
        super();
        this.name = name;
        this.message = message;
        this.day = day;
        this.hour = hour;
        /*# Do any work to initialize your class here. */
    }
    
    /**
     * Getter method which returns the name.
     * @return Returns the name.
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Getter method which shows us the message.
     * @return returns the message.
     */
    public String getMessage()
    {
        return this.message;
    }
    
    /**
     * Getter method which shows us the day.
     * @return Returns the day.
     */
    public int getDay()
    {
        return this.day;
    }
    
    /**
     * Getter method which returns the hour value.
     * @return Returns the hour value.
     */
    public int getHour()
    {
        return this.hour;
    }

    //~ Methods ...............................................................


}
