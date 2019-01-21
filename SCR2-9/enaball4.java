import greenfoot.*;

/**
 * Write a description of class enaball4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enaball4 extends enemy
{
    int way = 0;
    int rot = 0;
    /**
     * Act - do whatever the eneball3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if(way == 0){
        rot = (int)side2.getrot();
        way = 1;
        }else{
      setRotation( rot );
      move(5);
        }
      

        
      if( getX() > 590 || getX() < 10  || getY() > 390 || getY() < 10){
        getWorld().removeObject( this );
    }
    
    
    }    
}
