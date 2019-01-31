import greenfoot.*;

/**
 * Write a description of class Pen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pen extends enemy
{
    int hp = 100;
    int show;
    int bit = 1;
    int bit2 =1;
    int bit3 = 1;
    int bit4 =1;
    int fin = 0;
    int delay = 10;
    static int sfin = 0;
    static int shp = 100;
    /**
     * Act - do whatever the Pen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (fin == 0){ 
      
        if (Worldgame.fa == 0)f1();
        
        sys();
        
    }else{
        getWorld().removeObject( this );
        sfin = 1;
        bit = 1;bit4=1;bit2=1;bit3=1;
        shp = 100;
        Worldgame.fa = 0;
    }
} 

  public void f1(){
           if(bit != 0){
            getWorld().addObject( new side(), getX(), getY() );
            bit--;
        } 
        if(bit2 != 0){
            getWorld().addObject( new side2(), getX(), getY() );
            bit2--;
        }
        
        if(bit3 != 0 && ((bit + bit2) == 0) ){
            getWorld().addObject( new side3(), getX(), getY() );
            bit3--;
        }
        if(bit4 != 0 && ((bit + bit2) == 0) ){
            getWorld().addObject( new side4(), getX(), getY() );
            bit4--;
        }
    }
    
  public void f2(){
      
    }

  public void sys(){
    Actor actor = getOneObjectAtOffset( 0, 0, ballet.class );
    if( actor != null ){
        if(hp <= 0){
            
               fin = 1;
        }else{
            hp--;
            getWorld().removeObject( actor );
        }
        
        
        show = 100- hp;
        shp = hp;
        for(int i = 0;i <= hp;i++){
            getWorld().showText("■",600-i*6,10);
  
        }
        
        for(int i = 0; i <=show;i++ ){
            getWorld().showText("",i*6,10);
        }
        getWorld().showText("HP:",30,30);}

    }

  public static int getfin(){
  return sfin;
  }
  public static int setfin(){
      sfin = 0;
  return   sfin;
  }
    public static int gethp(){
  return   shp;
  }
  
  }  
  

