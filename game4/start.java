import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start画面 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends World
{

    /**
     * Constructor for objects of class start画面.
     * 
     */
    public start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(1280, 720, 1);
        showText("Space Shooter Nakamura", 640, 300);
        showText("Push Space!!", 640, 350);
        showText("操作方法",640,500);
        showText("移動:w,a,s,d,矢印キー", 640,530);
        showText("弾の発射：space", 640,560);

    }

    public void act()
    {
        if( Greenfoot.isKeyDown( "space" ) ){
            World game = new MyWorld();
            Greenfoot.setWorld( game );
        }
    }
}
