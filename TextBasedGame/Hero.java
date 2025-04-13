
//-------------------------------------------------------------------------
/**
 *  Hero class which sets the quality, name, points of the hero 
 *  Takes the methods from the EnhancedUnit class 
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.22)
 */
public class Hero
    extends EnhancedUnit 
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Hero object.
     * @param name Parameter that takes the string value from the parent class.
     * @param points Parameter that takes the points value.
     */
    public Hero(String name, int points)
    {
        super(name, points);
        super.setQuality(5);
        super.setDefense(5);
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................


}
