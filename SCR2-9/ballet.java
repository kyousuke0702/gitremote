import greenfoot.*;

/**
 * Write a description of class ballet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ballet extends Actor
{
    /**
     * Act - do whatever the ballet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int direction = 1;
    int way = 0;
    int n = 10;
    
    public void ballet(){
        way = 1;
    }
    
   
        

    
    public void act() 
    {
        
        if(way == 0){
            

            direction = jiki.getrotation();
            way = 1;

        
    }else if ( way == 1 ){
         
            setRotation(90*direction);
            move(n);
 
  
    }
    
    if( getX() > 590 || getX() < 10  || getY() > 390 || getY() < 10){
        getWorld().removeObject( this );
    }else 
    {
    Actor actor = getOneObjectAtOffset( 0, 0, enemy.class );
    if( actor != null ){
        getWorld().removeObject( actor ); 
        getWorld().removeObject( this );
    }   
}
    
    }
}

