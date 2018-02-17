package pl.sternik.dk.zad11;

public class Zad11 {
	
 public static void stan_z(Stan stan)
    {
        switch (stan)
        {
            case realizowane:
                System.out.println(stan + " : " + "Pilne!"); 
				break;
				
            case zwrot:
                System.out.println(stan + " : " + "Kontakt!");
				break;
				
                default:
                System.out.println(stan.toString() + " : " + stan);
                break;
        }
    }
    enum Stan{
        nowe,
        oczekujace,
        realizowane,
        wyslane,
        zwrot
    }

    public static void main( String[] args )  {
        for(Stan stan: Stan.values())
        {
            stan_z(stan);
        }
    }       
  }
    
