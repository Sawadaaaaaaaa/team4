import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy_red2 extends Actor
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //敵の進�?速度
        setRotation(0);
        move(-5);
        //主人公の�?る位置にまっすぐ進�?
        if( isAtEdge() ){
            getWorld().removeObject( this );
        }
        stage2 stage = (stage2)getWorld();
        if(stage2.time <= 0){
            move(5);
        }
    }    
}
