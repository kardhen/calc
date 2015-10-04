import greenfoot.*;

/**
 * Write a description of class Cyfra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cyfra extends Actor
{
    int cyfraKliknieta;
    public void act() 
    {
        Space swiat=(Space) getWorld();//wywołanie świata
        
        if(Greenfoot.mouseClicked(this)){
            swiat.licznik.dodajCyfre(this.cyfraKliknieta);
        }    
    }    
}
