import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class darkness here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class darkness extends Actor
{
    /**
     * Act - do whatever the darkness wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(0);
        move(-10);
        //主人公のいる位置にまっすぐ進む
        if( isAtEdge() ){
            getWorld().removeObject( this );
        }
    }    
}
