package pl.sternik.dk.zad06;

/**
 * Hello world!
 *
 */
public class Zad06
{
    public static void main( String[] args )
    {

        int[][] tab = {{3, 8, 28},
                {1,22,24,28},
                {4,7}
        };

        int max = tab[0][0];
        int min = tab[0][0];

        for (int i = 0; i < tab.length; i++) {

            for (int j = 0; j <tab[i].length ; j++) {

                if (tab[i][j] > max)
                {
                    max = tab[i][j];
                }
                if (tab[i][j]< min)
                {
                    min = tab[i][j];
                }
                System.out.println();
            }
        }
        System.out.println(max);
        System.out.println(min);


    }
}
