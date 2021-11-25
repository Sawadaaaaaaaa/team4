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
<<<<<<< HEAD
    private boolean movingleft = false; 
=======
    private boolean movingleft = false;
    private boolean flag_bullet = false;
>>>>>>> a0148e89dfaada14684c3c075f181d58acc27c12

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
<<<<<<< HEAD

            getWorld().addObject(new bullet(), getX(), getY());

        }    
=======
            if(flag_bullet == false){
                getWorld().addObject(new bullet(), getX(), getY());
                flag_bullet = true;
            }

        }
        else flag_bullet=false;
>>>>>>> a0148e89dfaada14684c3c075f181d58acc27c12
    }
}
