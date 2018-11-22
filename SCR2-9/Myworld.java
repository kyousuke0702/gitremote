import greenfoot.*;

/**
 * Write a description of class Myworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Myworld extends World
{

    /**
     * Constructor for objects of class Myworld.
     * 
     */
    public Myworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
                
        addObject(new enemy(),500,350);
        addObject(new enemy(),500,200);
        addObject(new enemy(),500,40);
<<<<<<< HEAD
        addObject(new Pizza(),0,350);
        addObject(new Pizza(),0,200);
        addObject(new Pizza(),0,40);
=======
        addObject(new jiki() ,300,200);
    }
    
    public void score(int sc){
        
>>>>>>> 639284a70152495fd616aa67dbd7ec734fb3ee1d
    }
}
