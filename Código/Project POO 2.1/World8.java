import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World8 extends World
{
    
    /**
     * Constructor for objects of class World8.
     * 
     */
    public World8()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 675, 1); 
        
        //int x = 0;
        //int y = 0;
        //MouseInfo m = Greenfoot.getMouseInfo();
        //x = m.getX();
        //y = m.getY();
        //if(Greenfoot.mouseClicked(this)) prepare(m, x, y);
        prepare();
    }
    private void prepare()
    {
        addObject(new Escritorio(),100,100);
    }
}
