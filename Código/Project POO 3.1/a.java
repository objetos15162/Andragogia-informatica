import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class a extends Actor
{
    /**
     * Act - do whatever the a wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            World w = getWorld();
            w = new EmailWorld6();
            Greenfoot.setWorld(w);
        }
    }    
}
