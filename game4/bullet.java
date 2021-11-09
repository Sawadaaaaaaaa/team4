import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Actor
{
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bullet()
    {
        GreenfootImage image = getImage();
        image.scale(10, 10);
        setImage(image);
    }

    public void act() 
    {
        setRotation(0);
        move(6);

        if( isAtEdge() ){
        getWorld().removeObject( this );
        }
        Actor actor = getOneIntersectingObject( enemy.class );
        if( actor != null ){

            getWorld().removeObject( actor );
        }

    } 
}
