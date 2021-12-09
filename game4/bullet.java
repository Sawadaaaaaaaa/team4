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
    private boolean flag_remove = false;
    public void act() 
    {
        setRotation(0);
        move(6);
        Actor actor = getOneIntersectingObject( enemy.class );
        Actor actor2 = getOneIntersectingObject( enemy_red.class );
        if( actor != null){
            if(flag_remove==false){
                getWorld().removeObject( actor );
                flag_remove=true;
                MyWorld stage = (MyWorld)getWorld();
                stage.addScore(100);
            }
        }
        if( actor2 != null){
            if(flag_remove==false){
                getWorld().removeObject( actor2 );
                flag_remove=true;
                MyWorld stage = (MyWorld)getWorld();
                stage.addScore(300);
            }
        }
        if( isAtEdge() ){
            getWorld().removeObject( this );
        }
        if(flag_remove==true){
           getWorld().removeObject( this ); 
        }

    }
}
