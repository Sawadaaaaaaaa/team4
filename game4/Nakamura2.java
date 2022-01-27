import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sawada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nakamura2 extends Actor
{
    /**
     * Act - do whatever the sawada wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean movingleft = false;
    private int flag_bullet = 0;
    public void act() 
    {

        int x = getX(); 

        int y = getY(); 

        if( Greenfoot.isKeyDown( "left") ){ 

            setLocation( x-3,y ); 

        } 

        if( Greenfoot.isKeyDown("a" ) ){ 

            setLocation( x-3,y ); 

        } 

        if( Greenfoot.isKeyDown( "right") ){ 

            setLocation( x+3,y ); 

        } 

        if( Greenfoot.isKeyDown( "d" ) ){ 

            setLocation( x+3,y ); 

        } 

        if( Greenfoot.isKeyDown( "up") ){ 

            setLocation( x,y-3 ); 

        } 

        if( Greenfoot.isKeyDown( "w" ) ){ 

            setLocation( x,y-3 ); 

        } 

        if( Greenfoot.isKeyDown( "down") ){ 

            setLocation( x,y+3 ); 

        } 

        if( Greenfoot.isKeyDown("s" ) ){ 

            setLocation( x,y+3 ); 

        }
        if(flag_bullet > 0) flag_bullet--;
        if(Greenfoot.isKeyDown("space")){
            if(flag_bullet == 0){
                getWorld().addObject(new bullet2(), getX(), getY());
                flag_bullet = 20;
            }

        }
    }
}
