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
    public int score;
    private int time;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        setBackground(new GreenfootImage("街.jpg"));
        score = 0;
        showScore();
        time = 25;
        showTime();
        this.addObject( new Nakamura(), 100, 360 );
        this.addObject( new Nakamura_sinzou(), 100, 360 );
        //this.addObject( new bullet(), 100, 360 );

        for(int i = 0; i < 5; ++i){
            int A = 600;
            int B = 1280;
            int x = A + (int)(Math.random()*((B-A)+1));

            B = 0;
            int y = A + (int)(Math.random()*((B-A)+1));
            addObject( new enemy(), x, y );

        }

    }

    private void countTime()
    {
        time--;
        showTime();

        if(time <= 0)
        {
            showEndMessage();
            //Greenfoot.stop();
            if( Greenfoot.isKeyDown( "space" ) ){
                World game = new stage2();
                Greenfoot.setWorld( game );
            }

        }
    }

    private void showTime()
    {
        if(time >=0){
            showText("Time; " +time, 700, 20);
        }else if(time <=0){
            showText("Time: 0",700,20);
        }
        
        
        
    }

    public void addScore(int points) //I've changed my addScore method to require a parameter of type int.
    {
        score = score + points;
        showScore();
    }

    /**
     * Show the end-of-game message on screen.
     */
    private void showEndMessage()
    {
        showText("Time is up - you win!", 390, 150);
        showText("Your final score: " + score + " points", 390, 170);
    }

    private void showScore()
    {
        showText("撃破数: " + score, 80, 25);
    }

    public void act()
    {
        countTime();

        // Greenfoot.playSound("BackgroundSound.mp3");
    }

}
