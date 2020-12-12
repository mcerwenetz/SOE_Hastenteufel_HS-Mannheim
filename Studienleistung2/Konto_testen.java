package Studienleistung2;

public class Konto_testen {

    public static void main (String[] args){

        Konto konto = new Konto("Daniel Bender","DE1300123456","1234",1234.58,true);

        System.out.println(konto.toString());
        System.out.println(konto.getKontoinhaber());
        System.out.println(konto.getKontonummer());
        System.out.println(konto.getPin());
        System.out.println(konto.getKontostand());
        System.out.println(konto.getIsaktiv());

        konto.setIsaktiv(false);

        System.out.println(konto.toString());
        System.out.println(konto.abbuchen(1500.00));


    }
    
}
