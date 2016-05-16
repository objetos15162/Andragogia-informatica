import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
/**
 * Write a description of class World1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World1 extends World
{

    /**
     * Constructor for objects of class World1.
     * 
     */
    public World1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 675, 1); 
        prepare();
    }
    public void prepare()
    {
        addObject(new Inicio(),19,660);
        GreenfootSound music0 = new GreenfootSound("0.wav"); 
        music0.play();
        getBackground().setFont(new Font("", 0, 20));
        getBackground().drawString("El escritorio es el área de la pantalla principal que",590,300);
        getBackground().drawString("se ve después de encender el equipo e iniciar",590,330);
        getBackground().drawString("sesión en Windows.",590,360);
        getBackground().drawString("Inicio: ",590,390);
        addObject(new Inicio(),680,390);
    }
}
