import greenfoot.*;

/**
 * Write a description of class jiki here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class jiki extends Actor
{
    static public int n,f;
    
    /**
     * Act - do whatever the jiki wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if (Greenfoot.isKeyDown( "shift" ))
        {n = 2; }else {n = 5;}
        
        if(Greenfoot.isKeyDown( "up" ) ){
            setRotation(270);
            move(n);
        
        }
        
        if(Greenfoot.isKeyDown( "down" )){
            setRotation(90);
            move(n);
        }
        if(Greenfoot.isKeyDown( "left" )){
            setRotation(180);
            move(n);
        }  
    
        if(Greenfoot.isKeyDown( "right" )){
            setRotation(0);
            move(n);
        }  
}
          
    
        }
   
