import greenfoot.*;

/**
 * Write a description of class jiki here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jiki extends Actor
{
    /**
     * Act - do whatever the jiki wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown( "down" )){
            setRotation(90);
            move(4);
    }
    else  if(Greenfoot.isKeyDown( "left" )){
            setRotation(180);
            move(4);
    }
    }    
}
