import greenfoot.*;
import java.awt.*;

public class Counter extends Actor
{
    int liczba1=0;
    int liczba2=0;
    int wynik=0;
    float iloraz;
    int dzialanie;
    String pierwsza="";
    String druga="";
    char operator=' ';
    String koniec="";
    
    public void act() 
    {
        /*Dwa sposoby na zamianę liczby na String. Pierwszy zastosowany w "if"
         * pierwsza=String.valueOf(liczba1); //sposób 2 też działa
         */
        if (liczba1!=0)
        {
            pierwsza=Integer.toString(liczba1);
        }       

        if(liczba2!=0)
        {
            druga=Integer.toString(liczba2);
        }
        GreenfootImage klikaj=new GreenfootImage(pierwsza +operator +druga +koniec, 36, Color.RED, null);
        setImage (klikaj);
    } 

    /*
     * "wynik" przyjmuje wartość na podstawie klawisza operatorów:
     * 1 - dodawanie
     * 2 - odejmowanie
     * 3 - mnożenie
     * 4 - dzielenie
     * Później wykorzystany jest po kliknieciu znaku równości.
     * Sam sposób ustawiania liczb nie wymaga tłumaczenia ;-)
     */
    
    public void dodajCyfre(int cyfra)
    {
        if (wynik==0)
        {
            if(liczba1==0)
            {
                liczba1=cyfra;
            }
            else
            {
                liczba1=liczba1*10+cyfra;
            }  
        }
        else
        {
            if(liczba2==0)
            {
                liczba2=cyfra;
            }
            else
            {
                liczba2=liczba2*10+cyfra;
            }  
        }
    }

    public void ustawZnak(int wynik, char operator)
    {
        this.wynik = wynik;
        this.operator = operator;
    }

    public void razem()
    {
        if(wynik==0)
        {
            koniec = "Hmm...";
        }
        else if(wynik==4)
        {
            iloraz= (float)liczba1 / (float)liczba2;
            koniec = "= " +Float.toString(iloraz);
        }
        else  {
            if(wynik==1)
        {
            dzialanie=liczba1 + liczba2;
            }
        else if (wynik==2)
        {
            dzialanie=liczba1 - liczba2;            
        }
        else if (wynik==3)
        {
            dzialanie=liczba1 * liczba2;             
        }
        koniec = "= " + Integer.toString(dzialanie);       
       }     
    }
       
          
    public void kasuj()
    {
        liczba1=0;
        liczba2=0;
        wynik=0;
        pierwsza="";
        druga="";
        operator=' ';
        koniec="";
    }

}
