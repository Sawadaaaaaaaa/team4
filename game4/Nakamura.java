import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sawada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nakamura extends Actor
{
    /**
     * Act - do whatever the sawada wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean movingleft = false; 
    public void act() 
    {

        if( Greenfoot.isKeyDown( "right" ) ){
            if( movingleft ){
                setRotation(0);
                movingleft = false;
                getImage().mirrorHorizontally();
            }
            move(2);
        }// Add your action code here.

        // Add your action code here.
        if( Greenfoot.isKeyDown( "left" ) ){
            if( ! movingleft ){
                setRotation(0);
                movingleft = true;
                getImage().mirrorHorizontally();
            }
            move(-2);
        }

        if( Greenfoot.isKeyDown( "down" ) ){
            setRotation(45);
            move(2);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            setRotation(-45);

            move(2);
        }


    }    
}
