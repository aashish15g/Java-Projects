
//-------------------------------------------------------------------------
/**
 *  The Army class which is a derived class of the Squad class.
 *  This class shows the players team
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.30)
 */
public class Army
    extends Squad
{
    //~ Fields ................................................................
    private String playerName;
    private String faction;
 

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Army object.
     * @param armyTitle name of the army.
     * @param faction name of the faction.
     * @param player name of the player.
     */
    public Army(String armyTitle, String faction, String player)
    {
        super("a");
        this.setName(armyTitle);
        this.faction = faction;
        this.playerName = player;
        /*# Do any work to initialize your class here. */
    }
    
    /**
     * Getter method which returns the name of the player.
     * @return returns the name of the player.
     */
    public String getPlayerName()
    {
        return this.playerName;
    }
    
    /**
     * Setter method which changes the player's name to the desired
     * one in the parameter.
     * @param playerName Parameter that replaces the player name.
     */
    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }
    
    /**
     * Getter method which returns the name of the faction.
     * @return returns the name of the faction.
     */
    public String getFaction()
    {
        return this.faction;
    }
    
    /**
     * Setter method which changes the faction name to the desired
     * one in the parameter.
     * @param faction Parameter which replaces the faction name.
     */
    public void setFaction(String faction)
    {
        this.faction = faction;
    }
    
    /**
     * Override method which overrides toString to say the 
     * intended text
     * @return returns string which gives the player, the faction 
     * and the army.
     */
    public String toString()
    {
        String strin = "player:" + this.getPlayerName() + ", faction:"
                       + this.getFaction() + ", army:" + super.toString();
        return strin;              
                       
    }
       


    //~ Methods ...............................................................


}
