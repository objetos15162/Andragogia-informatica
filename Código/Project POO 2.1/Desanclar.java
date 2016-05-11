import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Desanclar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desanclar extends Actor
{
    /**
     * Act - do whatever the Desanclar wants to do. This method is called whenever
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
        if(m.getButton() == 1){
            //1-left click  3-right click
            World w = getWorld();
            w = new World8();
            Greenfoot.setWorld(w);
            GreenfootSound music0 = new GreenfootSound("5.wav");
            music0.play();
        }
    }
}
