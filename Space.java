import greenfoot.*;

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
   Jeden button1;
   Dwa button2;
   Trzy button3;
   Cztery button4;
   Piec button5;
   Szesc button6;
   Siedem button7;
   Osiem button8;
   Dziewiec button9;
   Zero button0;
   Plus buttonPlus;
   Minus buttonMinus;
   Pomnoz buttonPomnoz;
   Podziel buttonPodziel;
   Kasuj buttonKasuj;
   Razem buttonRazem;   
   Counter licznik;
    public Space()
    {    
        super(470, 400, 1); 
        button1=new Jeden();//dodanie obiektu  Guziczek do świata
        addObject(button1, 100, 140);
        button2=new Dwa();//dodanie obiektu  Guziczek do świata
        addObject(button2, 235, 140);
        button3=new Trzy();//dodanie obiektu  Guziczek do świata
        addObject(button3, 370, 140);
        button4=new Cztery();//dodanie obiektu  Guziczek do świata
        addObject(button4, 100, 180);
        button5=new Piec();//dodanie obiektu  Guziczek do świata
        addObject(button5, 235, 180);
        button6=new Szesc();//dodanie obiektu  Guziczek do świata
        addObject(button6, 370, 180);
        button7=new Siedem();//dodanie obiektu  Guziczek do świata
        addObject(button7, 100, 220);
        button8=new Osiem();
        addObject(button8, 235, 220);
        button9=new Dziewiec();
        addObject(button9, 370, 220);
        button0=new Zero();
        addObject(button0, 100, 260);
        buttonPlus=new Plus();
        addObject(buttonPlus, 235, 260);
        buttonMinus=new Minus();
        addObject(buttonMinus, 100, 300);
        buttonPomnoz=new Pomnoz();
        addObject(buttonPomnoz, 235, 300);
        buttonPodziel=new Podziel();
        addObject(buttonPodziel, 100, 340);
        buttonKasuj=new Kasuj();
        addObject(buttonKasuj, 235, 340);
        buttonRazem=new Razem();
        addObject(buttonRazem, 370, 310);        
        licznik=new Counter();//dodanie obiektu Counter do świata
        addObject(licznik, 200, 65);
    }
    
}
