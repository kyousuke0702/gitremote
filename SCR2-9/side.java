import greenfoot.*;

/**
 * Write a description of class side here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class side extends enemy
{
    /**
     * Act - do whatever the side wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int xflag = 0;
    int hp = 25;
    int locat = 90 ;
    static double rand = 0;
    static double rot ;
    int delay = 30;
    public void act() 
    {
        
    if (xflag != 1){
        if(getX() != 100){setLocation( getX()-2,getY() );}else{xflag = 1;}
    }
    
    if(xflag == 1){
        rand += 0.03;
         rot = (45*Math.sin(rand)) + 45;
        setRotation( (int) (45*Math.sin(rand)) );
       if (delay == 0 ){
        delay = 30;
        getWorld().addObject( new eneball3(), getX(), getY() );
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
    
    static public double getrot(){
        return rot;
    }
}
