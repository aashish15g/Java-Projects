
//-------------------------------------------------------------------------
/**
 *  GameElement Interface used to solve this program 
 *  Interface that is used throughout the entire program 
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.22)
 */
public interface GameElement
{
    //~ Methods ...............................................................
     /**
     * Get this GameElement's name.
     *
     * @return This object's name as a string.
     */
    public String getName();

    /**
     * Get this GameElement's cost in points.
     *
     * @return The number of points for this object.
     */
    public int getPoints();
    // ----------------------------------------------------------
    
}
