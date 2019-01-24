import greenfoot.*;

/**
 * Write a description of class Worldgame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worldgame extends World
{

    /**
     * Constructor for objects of class Worldgame.
     * 
     */
    int show = 150;
    
    public Worldgame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
                
        addObject(new Pen(),300,100);


        addObject(new jiki() ,300,300);
        
        Pen.setfin();
        
    }
    
    
        public void act()
    {
        
       if(show != 0){
            showText("←↓↑→　and  'z' key ",300,100);
            show--;
        }else{
            showText("",300,100);
        }
  
      

    }
}
