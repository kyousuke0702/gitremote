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
        // Add your action code here.
        if(Greenfoot.isKeyDown( "down" )){
            setRotation(90);
<<<<<<< HEAD
            move(10);
    }
    else  if(Greenfoot.isKeyDown( "left" )){
            setRotation(180);
            move(4);
    }  
    
     else  if(Greenfoot.isKeyDown( "right" )){
            setRotation(0);
            move(5);
    }  
}
=======
            move(n);
    }
    else  if(Greenfoot.isKeyDown( "left" )){
            setRotation(180);
            move(n);
    }
    }    
>>>>>>> 854241497361791e7e05def1a2b734c64337cdd1
}
