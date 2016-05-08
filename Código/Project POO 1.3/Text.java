import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    String[] texto = {"Hola", "padre", "escuela", "departamento", "hardware"
    };
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        MuestraPalabras();
        
    }    
    public void MuestraPalabras()
    {
        setImage(new GreenfootImage(texto[2],75,Color.BLACK,Color.WHITE));
         for(int i = 0; i < 5; i++)
        {
            setImage(new GreenfootImage(texto[i],75,Color.BLACK,Color.WHITE));
            Greenfoot.delay(50);
        }
    }
}
