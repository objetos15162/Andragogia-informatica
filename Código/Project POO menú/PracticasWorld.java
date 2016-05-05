import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class PracticasWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PracticasWorld extends World
{

    /**
     * Constructor for objects of class PracticasWorld.
     * 
     */
    public PracticasWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(700, 700, 1); 
       GreenfootImage background = getBackground();
       background.setColor(Color.white);
       background.fill();
       objetos();
    }
    public void objetos()
    {
        addObject(new Back(),350,600);
        addObject(new Componentes(),250,200);
        addObject(new Sistema(),275,300);
        addObject(new Internet(),110,400);
    }
}
