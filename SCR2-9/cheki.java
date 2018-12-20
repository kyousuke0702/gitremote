import greenfoot.*;

/**
 * Write a description of class cheki here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cheki extends Actor
{
    int selflag=0;
    double x=0;

    public void act() 
    {
        
        x += 0.1;
        
        if( Greenfoot.isKeyDown( "up" ) ){
            selflag = 0;
        }
        
        if( Greenfoot.isKeyDown( "down" ) ){
            selflag = 1;
        }
        
        if (selflag == 1){
            setLocation( 310+(int)(10*Math.cos(x)),300 );
        }
        
        if (selflag == 0){
            setLocation( 310,300 );
        }
    }    
}
