import greenfoot.*;

/**
 * Write a description of class eneball2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class eneball2 extends enemy
{
    /**
     * Act - do whatever the eneball2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            
      setRotation(180);
      move(5);
        
      if( getX() > 590 || getX() < 10  || getY() > 390 || getY() < 10){
        getWorld().removeObject( this );
    }
    }    
}
