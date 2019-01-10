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
    int balletflag = 0;
    static int direction = 1;
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
            direction = 3;
            
        }
        
        if(Greenfoot.isKeyDown( "down" )){
            setRotation(90);
            move(n);
            direction = 1;
        }
        
        if(Greenfoot.isKeyDown( "left" )){
            setRotation(180);
            move(n);
            direction = 2;
        }  
    
        if(Greenfoot.isKeyDown( "right" )){
            setRotation(0);
            move(n);
            direction = 0;
        }
        
        if(Greenfoot.isKeyDown( "z" ) || Greenfoot.isKeyDown( "x" )){
            
            if(balletflag == 0){
                getWorld().addObject( new ballet(), getX(), getY() );
                balletflag = 1;
            }
           
            
            
        }else{
            balletflag = 0;
        } 
}
          
static int getrotation(){
    return direction;
}    

        }
   
