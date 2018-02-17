package pl.sternik.dk.zad05;

/**
 * Hello world!
 *
 */
public class Zad05
{
    public static void main( String[] args )
    {

        String[] tablica = {"jeden","dwa","trzy"};

        for (int i = 0; i < tablica.length; i++) {

            System.out.println(tablica[i]);
        }

        for (String x:tablica){

            System.out.println(x);
        }

        int i = 0;

        while (i<tablica.length) {

            System.out.println(tablica[i]);
            i++;
        }


    }
}
