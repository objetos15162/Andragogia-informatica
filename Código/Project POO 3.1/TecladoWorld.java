import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class TecladoWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TecladoWorld extends World
{

    /**
     * Constructor for objects of class TecladoWorld.
     * 
     */
    public TecladoWorld()
    {    
        // Create a new world with 700x700 cells with a cell size of 1x1 pixels.
       super(700, 700, 1); 
       GreenfootImage background = getBackground();
       background.setColor(Color.WHITE);
       background.fill();
       prepare();      
    }
    private void prepare()
    {
       
    } 
}