import greenfoot.*;

/**
 * Write a description of class side2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class side2 extends enemy
{
    /**
     * Act - do whatever the side2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int hp = 25;
    int xflag = 0;
        static double rand = 0;
    static double rot ;
    int delay = 40;
    int delay2 = 0;
    public void act() 
    {
     if (Pen.getfin() == 0){  

        if (Worldgame.fa == 0)fase1();
        if (Worldgame.fa == 1)fase2();
        sys();
        
        
 
    }else
    {
        getWorld().removeObject( this );
    }

}
    public void fase1(){         
    if(getX() !=500){setLocation( getX()+2,getY() );}else{xflag = 1;}
            if(xflag == 1){
        rand += 0.05;
         rot = (45*Math.sin(rand)) + 135;
        setRotation( (int) (45*Math.sin(rand)) );
       if (delay == 0 ){
        delay = 30;
        getWorld().addObject( new enaball4(), getX(), getY() );
    }else{
        delay--;
    }
        
    }
}

        public void fase2(){
        
        if(xflag == 1){
    
            if(delay2 > 60){
                if(delay2 == 61){getWorld().addObject( new cath(), jiki.getx(), jiki.gety() );}
               if(delay2 <= 150)beam();
               if(delay2 >= 160){delay2 = 0;}
               delay2++;
            } else{
               delay2++;
            rot = 270 + 182*Math.atan2(jiki.getx() - getX(),-jiki.gety() + getY()) /Math.PI;
            setRotation((int)(-90 +rot));
            }
            
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
    }
    
    public void beam(){
              if (delay == 0 ){
            delay = 1;
            
            getWorld().addObject( new enaball4(), getX(), getY() );
        }else{
            delay--;
        }
    }

        static public double getrot(){
        return rot;
    }
}
