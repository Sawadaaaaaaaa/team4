import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet2 extends Actor
{
    /**
     * Act - do whatever the bullet2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound bgm = null;
    public bullet2()
    {
        GreenfootImage image = getImage();
        image.scale(10, 10);
        setImage(image);
        bgm = new GreenfootSound( "hit.mp3" );
    }
    private boolean flag_remove = false;
    public void act() 
    {
        setRotation(0);
        move(6);
        Actor actor = getOneIntersectingObject( enemy2.class );
        Actor actor2 = getOneIntersectingObject( enemy_red2.class );
        Actor actor3 = getOneIntersectingObject( darkness.class );
        if( actor != null){
            if(flag_remove==false){
                getWorld().removeObject( actor );
                flag_remove=true;
                stage2 stage = (stage2)getWorld();
                stage.addScore(100);
                started();
            }
        }
        if( actor2 != null){
            if(flag_remove==false){
                getWorld().removeObject( actor2 );
                flag_remove=true;
                stage2 stage = (stage2)getWorld();
                stage.addScore(300);
                started();
            }
        }
        if( actor3 != null){
            if(flag_remove==false){
                getWorld().removeObject( actor3);
                flag_remove=true;
                stage2 stage = (stage2)getWorld();
                stage.addScore(500);
                started();
            }
        }
        if( isAtEdge() ){
            getWorld().removeObject( this );
        }
        if(flag_remove==true){
           getWorld().removeObject( this ); 
        }

    }
    public void started()
    {
        bgm.play();
    }
}
