import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escritorio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escritorio extends Actor
{
    private int x = 0;
    private int y = 0;
    private int band = 1;
    /**
     * Act - do whatever the Escritorio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this))  mouseClick(mouse);
    }  
    private void mouseClick(MouseInfo mouse)
    {
        if (mouse != null) {
            x = mouse.getX();
            y = mouse.getY();
            if (Greenfoot.mouseClicked(null) && mouse.getButton() == 3 && band == 1){
                if (x > 0 && x < 1080 && y > 0 && y < 675){
                    getWorld().addObject(new Contextual(), x+120, y+110);
                    getWorld().addObject(new Personalizar(), x+120, y+213);
                }
                band = 0;
            }
        }
    }
}
