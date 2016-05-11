import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inicio2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inicio2 extends Actor
{
    /**
     * Act - do whatever the Inicio2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here. MouseInfo m = Greenfoot.getMouseInfo();
        MouseInfo m = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)) checkClick(m);
    }    
    private void checkClick(MouseInfo m)
    {
        if(m.getButton() == 1){
            //1-left click  3-right click
            World w = getWorld();
            w = new World4();
            Greenfoot.setWorld(w);
            
            GreenfootSound music0 = new GreenfootSound("4.wav"); 
            music0.play();
        }
    }
}
