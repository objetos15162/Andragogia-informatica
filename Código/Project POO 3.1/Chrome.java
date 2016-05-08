import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chrome extends Actor
{
    /**
     * Act - do whatever the Chrome wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            World w = getWorld();
            w = new EmailWorld1();
            Greenfoot.setWorld(w);
        }
    }    
}
