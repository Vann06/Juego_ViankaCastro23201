import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Movers
{
    /**
     * Act - do whatever the Jugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void ganaste()
    {
        if(isTouching(Win.class))
        {
            getWorld().addObject(new pantalla(),getWorld().getWidth()/2,getWorld().getHeight()/2);
        }
    }
        
}

