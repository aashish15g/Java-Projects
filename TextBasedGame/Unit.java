import java.util.*;
//-------------------------------------------------------------------------
/**
 *  The class which defines the Unit and all the attributes it can have 
 *  The class implements the GameElement interface 
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.22)
 */
public class Unit
     implements GameElement
{
    //~ Fields ................................................................
    private String name;
    private int points;
    private int quality;
    private int defense;
    private List<Upgrade> upgrades;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Unit object.
     * @param name Parameter that takes a string value
     * to make the name of the unit 
     * @param points parameter that shows us the points an unit has.
     */
    public Unit(String name, int points)
    {
        super();
        this.name = name;
        this.points = points;
        this.quality = 2;
        this.defense = 2;
        upgrades = new ArrayList<Upgrade>();
        
        /*# Do any work to initialize your class here. */
    }
    
    /**
     * Getter method which returns the name of the unit.
     * @return returns the name of the unit.
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Setter method which takes the string parameter 
     * and changes it to the desired value. 
     * @param name Parameter which takes the string value and changes it.
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Getter method which returns the amount of points a unit has.
     * @return returns the value of the points.
     */
    public int getPoints()
    {
        int upgradePoints = 0;
        for (Upgrade upgrade : upgrades)
        {
            upgradePoints = upgradePoints + upgrade.getPoints();
        } 
        return this.points + upgradePoints;
    }
    
    /**
     * Setter method that takes the int parameter 
     * and changes it to the specified value
     * @param points The parameter that takes the 
     * int value and changes it to the desired value.
     */
    public void setPoints(int points)
    {
        this.points = points;
    }
    
    /**
     * Getter methood that returns the quality of the unit. 
     * @return returns the value of the quality.
     */
    public int getQuality()
    {
        return this.quality;
    }
    
    /**
     * Setter method that takes the int parameter and 
     * changes it to the desired value. 
     * @param quality The parameter that takes the 
     * int value and changes it to the new desired quality value.
     */
    public void setQuality(int quality)
    {
        this.quality = quality;
    }
    
    /**
     * Getter methood that returns the defense attribute of the unit. 
     * @return returns the value of the defense attribute.
     */
    public int getDefense()
    {
        return this.defense;
    }
    
    /**
     * Setter method that takes the int parameter and 
     * changes it to the desired value. 
     * @param defense The parameter that takes the 
     * int value and changes it to the new desired defense value.
     */
    public void setDefense(int defense)
    {
        this.defense = defense;
    }
    
    /**
     * Getter method which returns the list of upgrades available.
     * @return returns the upgrade list.
     */
    public List<Upgrade> getUpgrades()
    {
        return this.upgrades;
    }
    
    /**
     * Method which takes a certain upgrade and adds it to the upgrade list.
     * @param upgrade parameter which adds the certain upgrade to the list.
     */
    public void addUpgrade(Upgrade upgrade)
    {
        upgrades.add(upgrade);
    }
    
    /**
     * Method that takes a upgrade parameter and removes it from the total
     * upgrade list 
     * @param upgrade parameter which removes the upgrade from the 
     * list
     */
    public void removeUpgrade(Upgrade upgrade)
    {
        upgrades.remove(upgrade);
    }
    
    /**
     * Override method which overrides toString to say the intended text.
     * @return returns the unit's name, points, defense, and qualility. 
     * Also returns any upgrades if the unit has any.
     */
    public String toString()
    {
        String strin = name + " (" + this.getPoints() + ", " + 
                       this.getQuality() + ", " + this.getDefense() + ")";
        if (this.getUpgrades().size() == 0)
        {
            return strin;
        }
        else 
        {
            return strin + " upgrades:" + upgrades;
        }
    }
    
    //~ Methods ...............................................................


}
