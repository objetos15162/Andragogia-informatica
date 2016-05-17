import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
/**
 * Write a description of class World3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World3 extends World
{

    /**
     * Constructor for objects of class World3.
     * 
     */
    public World3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 675, 1); 
        prepare();
    }
    private void prepare()
    {
        addObject(new B1(),30,475);
        addObject(new B2(),45,95);
        addObject(new B3(),85,5);
        addObject(new B4(),180,150);
        addObject(new B5(),210,200);
        addObject(new B6(),480,100);
        addObject(new B7(),1030,190);
        addObject(new B8(),800,600);
        getBackground().setFont(new Font("", 0, 20));
        getBackground().drawString("Selecciona cualquier circulo numerado para obtener",620,250);
        getBackground().drawString("más información del área correspondiente.",620,280);
        GreenfootSound music0 = new GreenfootSound("2.wav"); 
        music0.play();
    }
}
