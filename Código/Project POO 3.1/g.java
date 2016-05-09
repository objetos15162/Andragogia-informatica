import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write g description of class g here.
 * 
 * @author (your name) 
 * @version (g version number or g date)
 */
public class g extends Actor
{
    /**
     * Act - do whatever the g wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            World w = getWorld();
            w = new EmailWorld7();
            Greenfoot.setWorld(w);
        }
    }    
}
