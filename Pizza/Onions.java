import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Onions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Onions extends Actor
{
    /**
     * Act - do whatever the Onions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int size;
    
    public Onions(int theSize){
        size = theSize;
        getImage().scale(10*size, 10*size); 

    }
}
