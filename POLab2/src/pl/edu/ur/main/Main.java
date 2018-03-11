package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author Krzysztof Rogowski
 */
public class Main {

    public void zad3()
    {
       Scanner odczyt=new Scanner(System.in);
       System.out.println("podaj liczby do tablicy");
        int tab [] = new int[10];
        for(int i=0;i<10;i++)
        {
           tab[i]=odczyt.nextInt();
             }
        System.out.println("1.ta tablica od pierwszego indeksu to");
        System.out.println("2.od odstaniego");
        System.out.println("3.co nieparzyste");
         System.out.println("4.parzyste");
         int n=1;
         do
         {    
            n=odczyt.nextInt();
            if(n==1)
            {   
                System.out.println("1.ta tablica od pierwszego indeksu to");
                for(int i=0;i<10;i++)
                    {
                        System.out.println(tab[i]);
                    }
            }
            else if(n==2)
            {    
                System.out.println("2.od odstaniego");
                for(int i=9;i>=0;i--)
                    {
                        System.out.println(tab[i]);
                    }
            }
            else if(n==3)
            {
                System.out.println("3.nieparzyste");    
                 for(int i=0;i<10;i+=2)
                    {
                        System.out.println(tab[i]);
                    }
            }
            else if(n==4)
            {
                System.out.println("4.parzyste");
                for(int i=1;i<10;i+=2)
                     {
                        System.out.println(tab[i]);
                     }
            }
        }while(n!=0);
         
   }
    public void zad4()
    {
        Scanner odczyt=new Scanner(System.in);
        System.out.println("podaj liczby do tablicy");
        int tab [] = new int[10];
        for(int i=0;i<10;i++)
        {
           tab[i]=odczyt.nextInt();
             }
        int n=1;
        System.out.println("1.suma elementów tablicy");
         System.out.println("2.iloczyn elementów tablicy");
         System.out.println("3.srednia elementów tablicy");
         System.out.println("4.minimany element tablicy");
         System.out.println("5.maksumalny element tablicy");
         System.out.println("podaj nr");
        
        while(n!=0)
        {
                n=odczyt.nextInt();
                switch(n)
            {
                   
            case 1:
            {
                 int suma=0;
                 for(int i=0;i<10;i++)
                 {
                    suma+=tab[i];
                }
                System.out.println("Suma to "+suma);
                break;
            }
             case 2:
            {
                 float iloczyn=1;
                 for(int i=0;i<10;i++)
                 {
                    iloczyn*=tab[i];
                }
                System.out.println("iloczyn to "+iloczyn);
                break;
            }
            case 3:
            {
                 int suma=0;
                 for(int i=0;i<10;i++)
                 {
                    suma+=tab[i];
                    
                }
                 float wynik=suma/10;
                System.out.println("Suma to "+wynik);
                break;
            }
            case 4:
            {
                 int min;
                 min=tab[0];
                 for(int i=0;i<10;i++)
                 {
                    if(tab[i]<min)
                    min=tab[i];
                 }
                 
                System.out.println("Minimalna to "+min);
                break;
            }   
            case 5:
            {
                 int max;
                 max=tab[0];
                 for(int i=0;i<10;i++)
                 {
                    if(tab[i]>max)
                    max=tab[i];
                 }
                System.out.println("Max to "+max);
                break;
            }   
            }
        }
    }
    public void zad7()
    {
        Scanner odczyt=new Scanner(System.in);
        int n;
       
        System.out.println("podaj rozmiar tablicy");
        n=odczyt.nextInt();
        int tab [] = new int[n];
        int tymczasowa [] = new int[n];
        System.out.println("podaj el do tablicy");
        for(int i=0;i<n;i++)
        {
            tab[i]=odczyt.nextInt();
        }
        for(int i=0;i<n;i++)
        {    
            for(int j=0;j<n-1;j++)
            {
                if(tab[j]>tab[j+1])
                {
                    tymczasowa[j]=tab[j+1];
                    tab[j+1]=tab[j];
                    tab[j]=tymczasowa[j];
                    
                }
            }
        }   
        System.out.println("Posortowana tablica to");
         for(int i=0;i<n;i++)
         {
             System.out.println(tab[i]);
         }
        
        
    }
    public void zad6()
    {
       Scanner odczyt=new Scanner(System.in);
       int n=5;
       while(n>0)
      {
         n=odczyt.nextInt();
         if(n<0)
           {
            break;
           }
      }
       
    }
     public static void main(String[] args) 
     {
        Main ob=new Main();
        Scanner menu=new Scanner(System.in);
        int n;
        System.out.println("podaj nr zadania(1-4)");
        
        n=menu.nextInt();
    
        switch(n)
        {
            case 1:
            {
                ob.zad3();
                break;
            }
            case 2:
            {
                ob.zad4();
                break;
            }
            case 3:
            {
                ob.zad6();
                break;
            }
            case 4:
             {
                ob.zad7();
                break;
             }
        }
    
    }
    
    
}
