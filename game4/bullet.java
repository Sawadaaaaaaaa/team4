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
    //private int flag_tama = 0;
    public void act() 
    {
        setRotation(0);
        move(6);

        Actor actor = getOneIntersectingObject( enemy.class );
        if( actor != null ){

            getWorld().removeObject( actor );
        }

        if( isAtEdge() ){
            getWorld().removeObject( this );
        }

        /*if( flag_tama > 0 ) flag_tama--;
        if( Greenfoot.isKeyDown( "space" ) ){
        if( flag_tama == 0 ){
        getWorld().addObject( new bullet(), getX(), getY() );
        flag_tama = 50;  // 数字を変えると発射間隔が変わる
        }
        }*/ 
    }
}
