import greenfoot.*;

public class Razem extends Actor
{
    public void act() 
    {
        Space swiat=(Space) getWorld();//wywołanie świata
        Razem guzikRazem=swiat.buttonRazem;
        if(Greenfoot.mouseClicked(guzikRazem))
        {
            swiat.licznik.razem();  //wywołanie funkcji add w obiekcie licznik na świecie
        }

    }    
}
