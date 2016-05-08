import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EmailWorld1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmailWorld1 extends World
{

    /**
     * Constructor for objects of class EmailWorld1.
     * 
     */
    public EmailWorld1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 675, 1);
        prepare();
    }
    private void prepare()
    {
        addObject(new b(),100,100);
       
    } 
}
