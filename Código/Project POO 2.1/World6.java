import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World6 extends World
{

    /**
     * Constructor for objects of class World6.
     * 
     */
    public World6()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 675, 1); 
        prepare();
    }
    private void prepare()
    {
        addObject(new BAvast(),295,660);
    }
}
