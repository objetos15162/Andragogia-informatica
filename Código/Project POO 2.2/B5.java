import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B5 extends Actor
{
    /**
     * Act - do whatever the B5 wants to do. This method is called whenever
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
        getWorld().addObject(new C5(),850,400);
    }
}
