import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EmailWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmailWorld2 extends World
{

    /**
     * Constructor for objects of class EmailWorld2.
     * 
     */
    public EmailWorld2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 675, 1); 
        prepare();
    }
    private void prepare()
    {
        addObject(new d(),100,100);
       
    } 
}
