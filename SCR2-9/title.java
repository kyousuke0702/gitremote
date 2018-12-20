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
        
        showText("ここにタイトルを入れる",300,100);
        
    }
    
    public void act()
    {
    if( Greenfoot.isKeyDown( "space" ) ){
        World game = new Worldgame();
        Greenfoot.setWorld( game );
    }
  

    

    }
    
    
}
