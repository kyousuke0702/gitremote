import greenfoot.*;

/**
 * Write a description of class title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class title extends World
{

    public title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels
        super(600, 400, 1); 

        addObject( new gohan(), 300, 250 );
        addObject( new cheki(), 310, 300 );
        addObject( new carthol(), 220, 250 );
        
        showText("Push 'space' key",300,180);
        
        showText("The bee",300,100);
        
        showText(" 'z' ショット ",100,180);
        showText(" 'allow key' 動く ",100,220);
        showText(" 'shift ' 低速&弾方向固定 ",100,140);
        
    }
    
    public void act()
    {
    if( Greenfoot.isKeyDown( "space" ) ){
        World game = new Worldgame();
        Greenfoot.setWorld( game );
    }
    }
  
    
    
}
