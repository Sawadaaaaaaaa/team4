import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        setBackground(new GreenfootImage("街.jpg"));
        
        this.addObject( new Nakamura(), 100, 360 );
        this.addObject( new Nakamura_sinzou(), 100, 360 );
        this.addObject( new bullet(), 100, 360 );
        
        for(int i = 0; i < 5; ++i){
            int A = 600;
            int B = 1280;
            int x = A + (int)(Math.random()*((B-A)+1));

            B = 0;
            int y = A + (int)(Math.random()*((B-A)+1));
            addObject( new enemy(), x, y );
        }
    }
}
