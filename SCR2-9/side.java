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
    if (Pen.getfin() == 0){    
        
        if (Worldgame.fa == 0)fase1();
        if (Worldgame.fa == 1)fase2();
        hantei();
    
    }else{
        getWorld().removeObject( this );
    }
    
    
    }  
    
    static public double getrot(){
        return rot;
    }
    
    public void fase1(){
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
    }
    
        public void fase2(){
        double rot2;
        if(xflag == 1){
             rot =270 + 182*Math.atan2(jiki.getx() - getX(),-jiki.gety() + getY()) /Math.PI;
             rot2 = rot;
             rot += 45 * (1 - 2 *  Math.random());
            setRotation((int)(-90 +rot2));
           if (delay == 0 ){
            delay = 3;
            getWorld().addObject( new eneball3(), getX(), getY() );
        }else{
            delay--;
        }
            
        }
    }
    
    public void hantei(){
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
