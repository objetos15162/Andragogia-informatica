import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escritorio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escritorio extends Actor
{
    /**
     * Act - do whatever the Escritorio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        MouseInfo m = Greenfoot.getMouseInfo();
        //if(Greenfoot.mouseClicked(this)) checkClick(m);
    }
    private void checkClick(MouseInfo m)
    {
        if(m.getButton() == 3){
            //1-left click  3-right click
            World w = getWorld();
            w = new World7();
            Greenfoot.setWorld(w);
        }
    }
}
