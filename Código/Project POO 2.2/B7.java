import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B7 extends Actor
{
    /**
     * Act - do whatever the B7 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        MouseInfo m = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)) checkClick(m);
    }    
    private void checkClick(MouseInfo m)
    {
        getWorld().addObject(new C7(),850,400);
    }
}
