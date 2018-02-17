package pl.sternik.dk.zad09;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class Zad09
{
    public static void main( String[] args )
    {
		
        int[][] tab1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
      
		for (int i = 0; i <= tab1.length - 1; i++) {
            for (int j = 0; j <= tab1[i].length - 1; j++) {
                System.out.print(tab1[i][j] + " ");
            }
            System.out.print("\n");
        }
	  
	Scanner czytaj = new  Scanner (System.in); 
        System.out.print("Podaj pierwszy wiersz do zamiany: ");
	int wiersz1 = czytaj.nextInt()-1;	
        System.out.print("Podaj drugi wiersz do zamiany: ");	
        int wiersz2 = czytaj.nextInt()-1;
    
        zamien(wiersz1, wiersz2, tab1);
        
         for (int i = 0; i <= tab1.length - 1; i++) {
            for (int j = 0; j <= tab1[i].length - 1; j++) {
                System.out.print(tab1[i][j] + " ");
            }
            System.out.print("\n");
        }
      
    }
    public static int[][] zamien(int wiersz1, int wiersz2, int[][] tab1) {
    int[] zm1, zm2;
        zm1 = tab1[wiersz1];
        zm2 = tab1[wiersz2];
        tab1[wiersz1] = zm2;
        tab1[wiersz2] = zm1;
        return tab1;
    }
}
	
	
	
	
	
	