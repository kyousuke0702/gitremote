import greenfoot.*;

/**
 * Write a description of class Worldgame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worldgame extends World
{

    /**
     * Constructor for objects of class Worldgame.
     * 
     */
    public Worldgame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
                
        addObject(new enemy(),500,350);
        addObject(new enemy(),500,200);
        addObject(new enemy(),500,40);


        addObject(new Pizza(),0,350);
        addObject(new Pizza(),0,200);
        addObject(new Pizza(),0,40);

        addObject(new jiki() ,300,200);
    }
}