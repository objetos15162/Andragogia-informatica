import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
/**
 * Write a description of class CopyOfWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World4 extends World
{

    /**
     * Constructor for objects of class World4.
     * 
     */
    public World4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 675, 1); 
        prepare();
    }
    public void prepare()
    {
        addObject(new Avast(),35,125);
        getBackground().setFont(new Font("", 0, 20));
        getBackground().drawString("Agrega a la barra de tareas el icono de Avast Free",590,300);
        getBackground().drawString("Antivirus dando clic derecho sobre dicho icono.",590,330);
        
    }
}
