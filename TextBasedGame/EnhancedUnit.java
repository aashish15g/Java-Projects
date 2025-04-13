
//-------------------------------------------------------------------------
/**
 *  This class displays the special abilities a unit can possess 
 *  Much like the hero class, this class inherits most 
 *  of the methods from the Unit class
 *  
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.22)
 */
public class EnhancedUnit
    extends Unit
{
    //~ Fields ................................................................
    private String specialRule;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created EnhancedUnit object.
     * @param name Parameter that takes the string value from the parent class
     * @param points Paramter that takes the points value from the parent class
     */
    public EnhancedUnit(String name, int points)
    {
        super(name, points);
        this.specialRule = null;
        
        /*# Do any work to initialize your class here. */
    }
    
    /**
     * Getter method that outputs the specialRule. 
     * @return returns the special rule.
     */
    public String getSpecialRule()
    {
        return this.specialRule;
    }
    
    /**
     * Setter method which takes a string parameter 
     * and changes the special rule to the desired value
     * @param specialRule Parameter that takes 
     * a string value and changes it to make a new specialRule
     */
    public void setSpecialRule(String specialRule)
    {
        this.specialRule = specialRule;
    }
    
    /**
     * Override method which overrides toString to say the intended text
     * @return Returns a string which calls the parent class's toString
     *  method and adds the special rule when it is not equal to null.
     */
    public String toString()
    {
        if (this.specialRule != null)
        {
            return super.toString() + " special rule:[" + 
                   this.getSpecialRule() + "]";
        }
        else 
        {
            return super.toString();
        }
    }

    //~ Methods ...............................................................


}
