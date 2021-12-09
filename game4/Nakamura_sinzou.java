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
    private boolean flag_bullet = false;

    public void act() 
    {
        getImage().setTransparency(0);
        int x = getX(); 

        int y = getY(); 

        if( Greenfoot.isKeyDown( "left") ){ 

            setLocation( x-3,y ); 

        } 

        if( Greenfoot.isKeyDown("a" ) ){ 

            setLocation( x-3,y ); 

        } 

        if( Greenfoot.isKeyDown( "right") ){ 

            setLocation( x+3,y ); 

        } 

        if( Greenfoot.isKeyDown( "d" ) ){ 

            setLocation( x+3,y ); 

        } 

        if( Greenfoot.isKeyDown( "up") ){ 

            setLocation( x,y-3 ); 

        } 

        if( Greenfoot.isKeyDown( "w" ) ){ 

            setLocation( x,y-3 ); 

        } 

        if( Greenfoot.isKeyDown( "down") ){ 

            setLocation( x,y+3 ); 

        } 

        if( Greenfoot.isKeyDown("s" ) ){ 

            setLocation( x,y+3 ); 

        }
        Actor actor = getOneIntersectingObject( enemy.class );
        Actor actor2 = getOneIntersectingObject( enemy_red.class );
        if( actor != null || actor2 != null){
            // TARO とぶつかった時の処理を書く
            getWorld().showText("GAME OVER", 400, 200);
            Greenfoot.stop();
        }
        
    }
}
