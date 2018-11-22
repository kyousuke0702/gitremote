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
<<<<<<< HEAD
        
        if (Greenfoot.isKeyDown( "shift" ))
        {n = 2; }else {n = 5;}
        
        if(Greenfoot.isKeyDown( "up" ) ){
            setRotation(270);
            move(n);
        
        }
=======
        // Add your action code here.
        if(Greenfoot.isKeyDown( "down" )){
            setRotation(90);
            move(4);
    }
    else  if(Greenfoot.isKeyDown( "left" )){
            setRotation(180);
            move(4);
    }
>>>>>>> 0684d0f6050f905a85a0e08accb8c43eeff09d90
    }    
}
