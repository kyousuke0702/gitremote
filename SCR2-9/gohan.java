import greenfoot.*;

/**
 * Write a description of class gohan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gohan extends Actor
{
   int selflag = 0;
   double x=0;
    public void act() 
    {
        // Add your action code here.
        x += 0.1;
        
        if( Greenfoot.isKeyDown( "up" ) ){
            selflag = 0;
        }
        
        if( Greenfoot.isKeyDown( "down" ) ){
            selflag = 1;
        }
        
        if (selflag == 0){
            setLocation( 300+(int)(10*Math.cos(x)),250 );
        }
        
        if (selflag == 1){
            setLocation( 300,250 );
        }
    
    }
}
