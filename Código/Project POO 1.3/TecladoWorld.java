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
       addObject(new Clock(true, true, 15, "", this), 350, 442);
       Greenfoot.start();
     
       
    }
    private void prepare()
    {
        addObject(new Teclado(),350,300);
        addObject(new Text(),350,90);
        
    }
    public void alert() {
        getBackground().setFont(new Font("", 0, 40));
        getBackground().setColor(Color.red);
        getBackground().drawString("Alert method of world called", 135, 625);
    }
    
    
}