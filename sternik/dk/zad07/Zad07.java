package pl.sternik.dk.zad07;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Zad07
{
    public static void main( String[] args )
    {

        Scanner czytaj = new Scanner(System.in);


        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int j = 1; ; j++) {

            int x = czytaj.nextInt();
            for (int i = 0; i < tab.length; i++) {

                if (tab[i] % x == 0) {

                    System.out.println("liczba " + tab[i] + " jest podzielna przez " + x + " i jest na pozycji " + i);
                }
            }
            break;
        }


    }
}
