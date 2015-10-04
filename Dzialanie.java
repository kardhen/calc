import greenfoot.*;

/**
 * Write a description of class Dzialanie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dzialanie extends Actor
{
    int wynik;
    char operator;
    
    public void act() 
    {
        Space swiat=(Space) getWorld();//wywołanie świata
                
        if(Greenfoot.mouseClicked(this))
        {
            swiat.licznik.ustawZnak(this.wynik, this.operator);            
        }
        
    }    
}
