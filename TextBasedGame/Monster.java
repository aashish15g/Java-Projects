
//-------------------------------------------------------------------------
/**
 *  Intro CS clas teaching us the fundamentalls of java .
 *  This program teaches us how to use setter and getter methods
 *  properly.
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.22)
 */
public class Monster
    extends EnhancedUnit
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Monster object.
     * @param name Parameter that takes the string value from the parent class
     * @param points Parameter that takes the points value 
     */
    public Monster(String name, int points)
    {
        super(name, points);
        super.setQuality(4);
        super.setDefense(4);
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................


}
