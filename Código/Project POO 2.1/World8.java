import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
/**
 * Write a description of class CopyOfWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World8 extends World
{
   
    /**
     * Constructor for objects of class World8.
     * 
     */
    public World8()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 675, 1); 
        prepare();
    }

    private void prepare()
    {
        getBackground().setFont(new Font("", 0, 20));
        addObject(new Escritorio(),540,322);
        getBackground().drawString("Da clic derecho sobre esta área para que",590,300);
        getBackground().drawString("aparezca el menú contextual.",590,334);
        
    }
}
