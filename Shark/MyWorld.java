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
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        SlowFish slowFish = new SlowFish();
        addObject(slowFish,454,316);
        SlowFish slowFish2 = new SlowFish();
        addObject(slowFish2,225,305);
        SlowFish slowFish3 = new SlowFish();
        addObject(slowFish3,164,179);
        SlowFish slowFish4 = new SlowFish();
        addObject(slowFish4,330,60);
        Shark momShark = new Shark("momShark", 13);
        addObject(momShark,343,224);
        Shark dadShark = new Shark("dadShark", 17);
        addObject(dadShark,213,108);
        FastFish fastFish = new FastFish();
        addObject(fastFish,470,143);
        FastFish fastFish2 = new FastFish();
        addObject(fastFish2,182,97);
        FastFish fastFish3 = new FastFish();
        addObject(fastFish3,94,276);
    }
}
