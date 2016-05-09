import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EmailWorld6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmailWorld6 extends World
{

    /**
     * Constructor for objects of class EmailWorld6.
     * 
     */
    public EmailWorld6()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 675, 1); 
        prepare();
    }
    public void prepare()
    {
        addObject(new g(),100,100);
    }
}
