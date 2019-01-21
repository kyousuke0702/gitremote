import greenfoot.*;

/**
 * Write a description of class neball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class neball extends enemy
{
    /**
     * Act - do whatever the neball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
      setRotation(0);
      move(5);
        
      if( getX() > 590 || getX() < 10  || getY() > 390 || getY() < 10){
        getWorld().removeObject( this );
    }
    }    
}
