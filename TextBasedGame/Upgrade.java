
//-------------------------------------------------------------------------
/**
 *  Intro to CS 1114 class, teaching us the basic fundamentalls of java.
 *  This program teaches us how to use setter and getter methods
 *  properly.
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.22)
 */
public class Upgrade
    implements GameElement
{
    //~ Fields ................................................................
    private String name;
    private int points;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Upgrade object.
     * @param name Parameter that takes the string value and makes it into 
     * a name. 
     * @param points paramater that is an int value which shows the points.
     */
    public Upgrade(String name, int points)
    {
        super();
        this.name = name;
        this.points = points;
        /*# Do any work to initialize your class here. */
    }

    /**
     * Tests the getName method to see if it works as intended.
     * @return returns the string name.
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Setter method which takes a string parameter and switches the name
     * to the specified value
     * @param name is the parameter that changes the name.
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Getter method which returns the amount of points.
     * @return returns the amount of points.
     */
    
    public int getPoints()
    {
        return this.points;
    }
    
    /**
     * Setter method that takes an int and changes the amount of points to 
     * the value specified.
     * @param points Parameter which is an int value and changes the 
     * amount of points.
     */
    public void setPoints(int points)
    {
        this.points = points;
    }
    
    /**
     * Override method which overrides toString to say the intended text.
     * @return returns the upgrade's name and also its points.
     */
    public String toString()
    {
        return name + " (" + points + ")";
    }
    
    //~ Methods ...............................................................


}
