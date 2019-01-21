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
    /**
     * Act - do whatever the Pen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
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
        
        
    Actor actor = getOneObjectAtOffset( 0, 0, ballet.class );
    if( actor != null ){
        if(hp <= 0){
            getWorld().removeObject( this );

        }else{
            hp--;
            getWorld().removeObject( actor );
        }
        
        
        show = 100- hp;
        for(int i = 0;i <= hp;i++){
            getWorld().showText("■",600-i*6,10);
  
        }
        
        for(int i = 0; i <=show;i++ ){
            getWorld().showText("",i*6,10);
        }
        getWorld().showText("HP:",30,30);
    }  
    }    
}
