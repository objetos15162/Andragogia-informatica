import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write k description of class k here.
 * 
 * @author (your name) 
 * @version (k version number or k date)
 */
public class k extends Actor
{
    /**
     * Act - do whatever the k wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            World w = getWorld();
            w = new EmailWorld8();
            Greenfoot.setWorld(w);
        }
    }    
}
