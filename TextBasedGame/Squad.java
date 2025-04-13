import java.util.*;
//-------------------------------------------------------------------------
/**
 *  Squad class which shows a group of units
 *  This class inherits from its parent class which is the EnhancedUnit 
 *  class.
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.04)
 */
public class Squad
    extends EnhancedUnit
{
    //~ Fields ................................................................
    private List<Unit> units;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Squad object.
     * @param name Parameter which gives the name of the Squad.
     */
    public Squad(String name)
    {
        super(name, 0);
        units = new ArrayList<Unit>();
        /*# Do any work to initialize your class here. */
    }
    
    /**
     * Getter method which returns the list of the units.
     * @return returns the list of the units.
     */
    public List<Unit> getUnits()
    {
        return this.units;
    }
    
    /**
     * Method which adds a unit to the unit list.
     * @param unit Parameter which adds a unit attribute to the 
     * list.
     */
    public void addUnit(Unit unit)
    {
        units.add(unit);
    }
    
    /**
     * Method which removes a unit from the list.
     * @param unit Parameter which removes the unit from the list.
     */
    public void removeUnit(Unit unit)
    {
        units.remove(unit);
    }
    
    /**
     * Getter method that returns the total number of points the
     * squad has.
     * @return returns the total amount of points of the squad.
     */
    public int getPoints()
    {
        int sumPoints = 0;
        for (Unit unit : units)
        {
            sumPoints = sumPoints + unit.getPoints();
        }
        return sumPoints + super.getPoints();
        
    }
    
    /**
     * Override method which overrides toString to say the
     * intended text.
     * @return returns the units from the parent class
     */
    public String toString()
    {
        return super.toString() + " units:" + units;
    }

    //~ Methods ...............................................................


}
