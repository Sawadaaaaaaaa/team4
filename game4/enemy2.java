import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy2 extends Actor
{
    /**
     * Act - do whatever the enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //敵の進む速度
        setRotation(0);
        move(-1);
        //主人公のいる位置にまっすぐ進む
        if( isAtEdge() ){
            getWorld().removeObject( this );
        }
    }        
}
