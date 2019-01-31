import greenfoot.*;

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cath extends Actor
{
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int time = 80;
    public void act() 
    {
        if(time == 0){
            getWorld().removeObject( this );
        }else{
            time--;
        }
        
    }    
}
