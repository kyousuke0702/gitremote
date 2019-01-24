import greenfoot.*;

/**
 * Write a description of class jiki here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class jiki extends Actor
{
    static public int n,f;
    int balletflag = 0;
    static double direction = 1;
     static int xx ;
     static int yy ;
     int shift = 1;
     int hit= 0;
     int hf = 0;
     /**
     * Act - do whatever the jiki wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
 
        xx = getX();
        yy = getY();
        if (Greenfoot.isKeyDown( "shift" ))
        {n = 3;shift = 0; }else {n = 5;shift = 1;}
        
        if(Greenfoot.isKeyDown( "up" ) && Greenfoot.isKeyDown( "left" ) ){
            setRotation(225);
            move(n);
            if(shift != 0)
            direction = 2.5;
        }
        else if(Greenfoot.isKeyDown( "up" ) && Greenfoot.isKeyDown( "right" ) ){
            setRotation(315);
            move(n);
            if(shift != 0)
            direction = 3.5;
        }else if(Greenfoot.isKeyDown( "down" ) && Greenfoot.isKeyDown( "left" ) ){
            setRotation(135);
            move(n);
            if(shift != 0)
            direction = 1.5;
        }else if(Greenfoot.isKeyDown( "down" ) && Greenfoot.isKeyDown( "right" ) ){
            setRotation(45);
            move(n);
            if(shift != 0)
            direction = 0.5;
        }else if(Greenfoot.isKeyDown( "up" ) ){
            setRotation(270);
            move(n);
            if(shift != 0)
            direction = 3;
        }else if(Greenfoot.isKeyDown( "down" )){
            setRotation(90);
            move(n);
            if(shift != 0)
            direction = 1;
        }else if(Greenfoot.isKeyDown( "left" )){
            setRotation(180);
            move(n);
            if(shift != 0)
            direction = 2;
        }else if(Greenfoot.isKeyDown( "right" )){
            setRotation(0);
            move(n);
            if(shift != 0)
            direction =  0 ;
        }
        
        
        if(Greenfoot.isKeyDown( "z" ) || Greenfoot.isKeyDown( "x" )){
            
            if(balletflag == 0){
                getWorld().addObject( new ballet(), getX(), getY() );
                balletflag = 1;
            }
           
            
            
        }else{
            balletflag = 0;
        }
        
    Actor actor = getOneObjectAtOffset( 0, 0, enemy.class );
    if( actor != null && hf == 0){
        hit++;
        getWorld().showText("被弾数:"+hit,60,390);
        hf = 1;
    }else if(actor == null){
        hf = 0;
    } 
}
          
static double getrotation(){
    return direction;
} 

static int getx(){
    return xx;
}   
static int gety(){
    return yy;
}  

        }
   
