import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class TecladoWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmailWorld extends World
{

    /**
     * Constructor for objects of class EmailWorld.
     * 
     */
    public EmailWorld()
    {    
        // Create a new world with 700x700 cells with a cell size of 1x1 pixels.
       super(1080, 675, 1);
       prepare(); 
       //Greenfoot.playSound("HOLO.wav");
    }
    private void prepare()
    {
        addObject(new Chrome(),105,660);
       
    } 
}