import greenfoot.*;

/**
 * Write a description of class carthol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carthol extends Actor
{
    int selflag = 0;
    
    public void act() 
    {
        
    if( Greenfoot.isKeyDown( "up" ) ){
        selflag = 0;
        setLocation(220,250 );
    }
    
    if( Greenfoot.isKeyDown( "down" ) ){
        selflag = 1;
        setLocation( 220,300 );
    }
    

    
    }    
}
