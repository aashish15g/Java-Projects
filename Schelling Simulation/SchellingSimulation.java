import student.media.*;
import java.awt.Color;
import student.util.Random;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Aashish Ganeshkumar (906370814)

//-------------------------------------------------------------------------
/**
 *  Introductory CS 1114 class teaching us the fundamentals of java 
 *  Class covers the topics of writing a setter method, getter method and
 *  learning to use doubles
 *  @author Aashish Ganeshkumar (906370814)
 *  @version (2022.03.01)
 */
public class SchellingSimulation
    extends Picture 
{
    //~ Fields ................................................................
    private double satisfactionThreshold = 0.3;
    private int redline = 0;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created SchellingSimulation object.
     * @param width is the width of the simulation
     * @param height is the height of the simulation
     */
    public SchellingSimulation(int width, int height)
    {
        super(width, height);
        satisfactionThreshold = 0.3;
        redline = 0;
        /*# Do any work to initialize your class here. */
    }

    /**
     * Getter method that returns the satisfaction threshold
     * @return returns the satisfaction threshold 
     */
    public double getSatisfactionThreshold()
    {
        return satisfactionThreshold;
    }
    
    /**
     * A setter method which changes the satisfaction threshold
     * @param satisfaction gives the satisfaction threshold 
     */
    public void setSatisfactionThreshold(double satisfaction)
    {
        satisfactionThreshold = satisfaction;
    }
    
    /**
     * A getter method which returns the redline value
     * @return returns the redline value 
     */
    public int getRedLine()
    {
        return redline;
    }
    
    /**
     * setter method that takes an integer parameter 
     * and changes the redline to the specified value.
     * @param rl is the parameter which indicates the red line 
     */
    public void setRedLine(int rl)
    {
        redline  = rl;
    }
    
    /**
     * Populates the map with pixels
     * @param bluePix fills the map with blue pixels 
     * @param orangePix fils the map with orange pixels
     */
    public void populate(double bluePix, double orangePix)
    {
        Random generator = new Random();
        for (Pixel pix : this.getPixels())
        {
            double calculator = generator.nextDouble();
            if (calculator < bluePix)
            {
                pix.setColor(Color.BLUE);
            }
            if (bluePix < calculator && (calculator <= (bluePix + orangePix)
                && pix.getY() >= redline))
            {
                pix.setColor(Color.ORANGE);
            }
            
        }
    }
    
    /**
     * Method which compares two pixels and sees if they are the same pixels
     * @param pixelOne compares the first pixel 
     * @param pixelTwo compares the second pixel
     * @return returns true when the pixels are the same color
     */
    public boolean areSameColor(Pixel pixelOne, Pixel pixelTwo)
    {
        /*if (pixelOne.getColor() == pixelTwo.getColor())
        {
            return true;
        
        }
        else 
        return false;*/
        return pixelOne.getColor().equals(pixelTwo.getColor());
    }
    
    /**
     * Checks a pixel and returns true if the pixel color is white
     * @param pixie is the color of the pixel being checked
     * @return returns true when the pixel it white meaning it is empty
     */
    public boolean isEmpty(Pixel pixie)
    {
        /*boolean whiteColor = true;
        for (Pixel pix: this.getPixels())
        {
            pix.setColor(Color.WHITE);
            if (pixie.getColor() == pix.getColor())
            {
                whiteColor = true;
            }
            else 
            {
                whiteColor = false;
            }
             
        }
        return whiteColor;*/
        return pixie.getColor().equals(Color.WHITE);
    }
    
    /**
     * Checks whether the agent is satisfied or not
     * @param pixelz checks if the pixel is in a satisfied position 
     * @param coloring checks the color of the pixel
     * @return true if pixels are in a satisfied position 
     */
    public boolean isSatisfied(Pixel pixelz, Color coloring)
    { 
        double relatable = 0.0;
        double exactRelationship = 0.0;
        double satisfied;
        
        for (Pixel pix : pixelz.getNeighborPixels())
        {
            if (pix.getColor().equals(coloring))
            {
                relatable++;
                exactRelationship++;
            }
            else if (!isEmpty(pixelz))
            {
                relatable++;
            }
            
        }
        if (relatable == 0)
        {
            return true;
        }
        satisfied = exactRelationship / relatable;
        boolean contempt = satisfied >= getSatisfactionThreshold();
        return contempt;
        
        
        
    }
    
    /**
     * method which moves the agents if they are not in the proper place
     * @param pix is the pixel value 
     * @return returns true when the pixel needs to move to be satisfied
     */
    public boolean maybeRelocate(Pixel pix)
    {
        Random gen = new Random();
        int xCord = gen.nextInt(getWidth());
        int yCord = gen.nextInt(getHeight());
        Pixel identifier = getPixel(xCord, yCord);
        identifier.setColor(pix.getColor());
        pix.setColor(Color.WHITE);
        
        if (pix.getColor().equals(Color.ORANGE) &&
            pix.getY() <= redline)
        {
            return false;
        }
        if (!isEmpty(identifier))
        {
            return false;
        }
        /*if (isSatisfied(identifier, pix.getColor()))
        {
            return false;
        }*/
        return true;
        
    }
    
    /**
     * method which moves the agents if they are unsatisfied
     * @return returns total number of sucessful moves of the pixels 
     */
    public int cycleAgents()
    {
        int cycleCounter = 0;
        for (Pixel pix : getPixels())
        {
            boolean satisfactor = isSatisfied(pix, pix.getColor());
            boolean whiteSpace = pix.getColor().equals(Color.WHITE);
            if (!whiteSpace && !satisfactor)
            {
                boolean relocation = maybeRelocate(pix);
                if (relocation)
                {
                    cycleCounter++;
                }
            }
        }
        return cycleCounter;
        
    }
    //~ Methods ...............................................................


}
