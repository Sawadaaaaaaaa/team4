import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stage2 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    static public  int time;
    GreenfootImage back;
    GreenfootImage back_flop;
    int back_dx = -2; // スクロール速度(マイナスにすると左から右)
    int back_x = 0;
    int back_width;
    boolean flop = false;
    GreenfootSound bgm = null;
    public stage2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        setBackground(new GreenfootImage("space.jpg"));
        showScore();
        time = 2500;
        showTime();
        this.addObject( new Nakamura2(), 100, 360 );
        this.addObject( new Nakamura_sinzou2(), 100, 360 );
        //this.addObject( new bullet(), 100, 360 );
        back = new GreenfootImage( "./images/space.jpg" );
        back_flop = new GreenfootImage( "./images/space2.jpg" );
        back_width = back.getWidth();
        bgm = new GreenfootSound( "bgm.mp3" );

    }
    private void countTime()
    {
        time--;
        showTime();
        started();
        if(time <= 0)
        {
            showEndMessage();
            Greenfoot.stop();
            /*if( Greenfoot.isKeyDown( "enter" ) ){
            World game = new stage2();
            Greenfoot.setWorld( game );
            }*/

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
        MyWorld.score = MyWorld.score + points;
        showScore();
    }

    /**
     * Show the end-of-game message on screen.
     */
    private void showEndMessage()
    {
        showText("Time is up - you win!", 390, 150);
        showText("Your final score: " + MyWorld.score + " points", 390, 170);
    }

    private void showScore()
    {
        showText(" スコア: " + MyWorld.score, 80, 25);
    }

    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 2)
        {
            addObject(new enemy2(), 1200, Greenfoot.getRandomNumber(720));
        }
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new enemy_red2(), 1200, Greenfoot.getRandomNumber(720));
        }
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new darkness(), 1200, Greenfoot.getRandomNumber(720));
        }
        countTime();
        // Greenfoot.playSound("BackgroundSound.mp3");
        back_x += back_dx;
        if( back_x > 0){
            back_x -= back_width;
            flop = !flop;
        }
        if( back_x < -back_width ){
            back_x += back_width;
            flop = !flop;
        }
        getBackground().drawImage( flop ? back_flop : back, back_x, 0 );
        getBackground().drawImage( flop ? back : back_flop, back_x+back_width, 0 );

       
    }
    public void started()
    {
        bgm.playLoop();
    }

    public void stopped()
    {
        bgm.stop();
    }
}
