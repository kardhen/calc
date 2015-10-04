import greenfoot.*;

/**
 * Write a description of class Kasuj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kasuj extends Actor
{
    /**
     * Act - do whatever the Kasuj wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Space swiat=(Space) getWorld();//wywołanie świata
        Kasuj guzikKasuj=swiat.buttonKasuj;
        if(Greenfoot.mouseClicked(guzikKasuj))
        {
            swiat.licznik.kasuj();  
        }
    }    
}
