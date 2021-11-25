import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sawada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nakamura_sinzou extends Actor
{
    /**
     * Act - do whatever the sawada wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean movingleft = false; 

    public void act() 
    {
        getImage().setTransparency(0);
        if( Greenfoot.isKeyDown( "right" ) ){
            if( movingleft ){
                setRotation(0);
                movingleft = false;
                getImage().mirrorHorizontally();
            }
            move(3);
        }// Add your action code here.

        // Add your action code here.
        if( Greenfoot.isKeyDown( "left" ) ){
            if( ! movingleft ){
                setRotation(0);
                movingleft = true;
                getImage().mirrorHorizontally();
            }
            move(-3);
        }

        if( Greenfoot.isKeyDown( "down" ) ){
            setRotation(45);
            move(3);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            setRotation(-45);

            move(3);
        }
        Actor actor = getOneIntersectingObject( enemy.class );
        if( actor != null ){
            // TARO とぶつかった時の処理を書く
            getWorld().showText("GAME OVER", 400, 200);
            Greenfoot.stop();
        }
        if(Greenfoot.isKeyDown("space")){

            getWorld().addObject(new bullet(), getX(), getY());

        }    
    }
}
