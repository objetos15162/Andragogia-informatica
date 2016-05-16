import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
/**
 * Write a description of class CopyOfWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World5 extends World
{

    /**
     * Constructor for objects of class World5.
     * 
     */
    public World5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 675, 1); 
        prepare();
    }
    private void prepare()
    {
        addObject(new Barra(),161,310);
        getBackground().setFont(new Font("", 0, 20));
        getBackground().drawString("Después selecciona Anclar a la barra de tareas.",590,300);
        
    }
}
