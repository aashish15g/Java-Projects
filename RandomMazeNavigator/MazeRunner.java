
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 * Introductory CS 1114 class
 * focusing on wirting tests and create solutions using loops and variables
 *
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.02.15)
 */
public class MazeRunner
    extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
  /**
    * Initializes a newly created MazeRunner object.
    */
    public MazeRunner()
    {
        super(EAST, 10);
        /*# Do any work to initialize your class here. */
    }
    
  /**
   * The Method which instructs the mazerunner to clear the entire maze and 
   * return back 
   */
    public void clearMaze()
    {
        while (getX() != 1 || getY() != 1 ||
        this.getWorld().getObjects(Net.class).size() != 0 ||
        this.getWorld().getObjects(Flower.class).size() != 0)
        {
            disableNetsAndFlowers();
        
        
        
        }
    
    }
  
  /**
   * The Method which instructs the mazerunner to navigate through the maze
   * when there are flowers and nets 
   */
    public void disableNetsAndFlowers()
    {
        if (this.seesFlower(HERE))
        {
            this.pick();
            clearMaze();
        }
        else if (this.seesFlower(AHEAD))
        {
            this.hop();
            this.pick();
            clearMaze();
        }
        else if (this.seesFlower(LEFT))
        {
            this.turn(LEFT);
            this.hop();
            this.pick();
            clearMaze();
            
        }
        else if (this.seesNet(AHEAD))
        {
            this.toss();
            this.hop();
            clearMaze();
        }
        else if (!this.seesWater(AHEAD))
        {
            this.hop();
            pathChange();
            clearMaze();
        }
        else 
        {
            this.hugWater();
        }
    }
  
  /**
   * The Method which instructs the mazerunner to navigate through the maze
   * when it sees water 
   */
    public void hugWater()
    {
        if (this.seesWater(AHEAD) && this.seesWater(RIGHT))
        {
            this.turn(LEFT);
            clearMaze();
        }
        else if (this.seesWater(AHEAD) && this.seesWater(LEFT))
        {
            this.turn(RIGHT);
            clearMaze();
        }
        else if (this.seesWater(AHEAD) && this.isClear(LEFT))
        {
            this.turn(LEFT);
            clearMaze();
            
        }
    }   
  
  /**
   * The Method which instructs the mazerunner to change the path when 
   * it is clear to the left 
   */
    public void pathChange()
    {
        if (this.isClear(LEFT))
        {
            this.turn(LEFT);
            clearMaze();
        }
    }
}
    
    



