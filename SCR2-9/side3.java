import greenfoot.*;

/**
 * Write a description of class side3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class side3 extends enemy
{
    int hp = 25;
    int xflag =0;
    int delay = 0;
    int swit = 0; 
    /**
     * Act - do whatever the side3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (xflag != 2){
            if ( getX() != 50){setLocation( getX()-2,getY() );}else{xflag = 1;}
            if ( xflag == 1 && getY() !=300 ){
                 setRotation( 270);
                setLocation( getX(),getY()+2);
            }else if(xflag == 1){ xflag = 2;}
    }
    
   
    
    if (xflag == 2){
       if (swit == 0){
        setLocation( getX(),getY()+2);
        if(getY() >= 380){swit = 1;}
    }
    
        if (swit == 1){
        setLocation( getX(),getY()-2);
        if(getY() <= 100){swit = 0;}
    }
    
    if (delay == 0 ){
        delay = 30;
        getWorld().addObject( new neball(), getX(), getY() );
    }else{
        delay--;
    }
    
    }
    
    
    
    Actor actor = getOneObjectAtOffset( 0, 0, ballet.class );
    if( actor != null ){
        if(hp <= 0){
            getWorld().removeObject( this );

        }else{
            hp--;
            getWorld().removeObject( actor );
        }
        
    }
    }    
}
