import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class TecladoWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainWorld extends World
{
    
    /**
     * Constructor for objects of class TecladoWorld.
     * 
     */
    public MainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(700, 700, 1); 
       Greenfoot.start();
       GreenfootImage background = getBackground();
       background.setColor(Color.BLACK);
       background.fill();
       getBackground().setFont(new Font("",0,30));
       getBackground().setColor(Color.white);
       getBackground().drawString("       Universidad Autónoma de San Luis Potosí",20,50);
       getBackground().setFont(new Font("", 0, 20));
       getBackground().drawString("Facultad de Ingeniería",20,90);
       getBackground().drawString("Área de Computación e Informática",20,130);
       getBackground().drawString("Ingeniería en Computación",20,170);
       getBackground().drawString("Dr. Puente Montejano Cesar Augusto",20,210);
       getBackground().drawString("Amaya García José de Jesús",20,250);
       getBackground().drawString("Aplicación Sobre Andragogía Informática",20,290);
       objetos();
    }
    public void objetos()
    {
        //Play myPlay;
        //myPlay = new Play();
        addObject(new Play(), 270, 500);
        addObject(new Go(),430,500);
        addObject(new Stop(),350,600);
        
    }
}