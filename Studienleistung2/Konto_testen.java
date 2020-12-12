import java.util.HashMap;

public class Konto_testen {

    public static void main (String[] args){

        HashMap<String,String> zugangsdaten = new HashMap<>();

        zugangsdaten.put("DE1300123456","1234");
        
        Konto konto = new Konto("Daniel Bender","DE1300123456",zugangsdaten,1234.58,true);

        System.out.println(konto.toString());
        System.out.println(konto.getKontoinhaber());
        System.out.println(konto.getKontonummer());
        System.out.println(konto.getZugangsdaten());
        System.out.println(konto.getKontostand());
        System.out.println(konto.getAktiv());

        konto.setAktiv(false);

        System.out.println(konto.toString());


    }
    
}
