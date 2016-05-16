import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
/**
 * Write a description of class CopyOfWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World6 extends World
{

    /**
     * Constructor for objects of class World6.
     * 
     */
    public World6()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 675, 1); 
        prepare();
    }
    private void prepare()
    {
        addObject(new BAvast(),295,660);
        getBackground().setFont(new Font("", 0, 20));
        getBackground().drawString("Ahora elimina el icono que acabas de agregar",590,300);
        getBackground().drawString("dando clic derecho él.",590,330);
        
    }
}
