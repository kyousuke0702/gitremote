import greenfoot.*;

/**
 * Write a description of class side4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class side4 extends enemy
{
    /**
     * Act - do whatever the side4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int xflag = 0;
    int hp = 25;
    int delay = 10;
    
   
    
    public void act() 
    {
        if (Pen.getfin() == 0){  
            f1();
            sys();
        }else{
            getWorld().removeObject( this );
        }
    }   
    
    public void f1(){
          setRotation( 90);
        if (xflag != 2){
        if (xflag == 0 && getX() != 580){
            setLocation( getX()+2,getY() );
        }else{xflag = 1;}
        if ( xflag == 1 && getY() !=300 ){
            setLocation( getX(),getY()+2);
            
        }else if (xflag == 1){xflag = 2;}
    }
    }
    
    public void sys(){
            Actor actor = getOneObjectAtOffset( 0, 0, ballet.class );
    if( actor != null ){
        if(hp <= 0){
            getWorld().removeObject( this );

        }else{
            hp--;
            getWorld().removeObject( actor );
        }
        
    }
    if(xflag == 2){ delay--;}
    if(delay == 0 ){
       delay = 50;
       setLocation( getX(),jiki.gety());
       getWorld().addObject( new eneball2(), getX(), getY() );
    }
}
    
}
