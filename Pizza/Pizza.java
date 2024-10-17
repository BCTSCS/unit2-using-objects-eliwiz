import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Actor
{
    private String type;
    private int size;
    private Actor top;
    
    public Pizza(String theType, int theSize){
        type = theType;
        size = theSize;
        getImage().scale(10*size, 10*size); 
        getImage().setColor(Color.BLUE);
        getImage().drawString(type, 0, 0);

    }
    
    
    
    @Override
    protected void addedToWorld(World world){
    top = new Cheese();
    world.addObject(top, getX(), getY());
    }
}
