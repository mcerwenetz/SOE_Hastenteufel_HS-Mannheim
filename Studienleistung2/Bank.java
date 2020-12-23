package Studienleistung2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


abstract class Bank{
    private List<Konto> kontoliste;

    // Dieser Konstruktor bekommt Konten beim initialisieren übergeben
    public Bank(List<Konto> konten){
        this.kontoliste=konten;
    }

    // Dieser Konstruktor erstellt ein testkonto
    public Bank(){
        this.kontoliste = this.generateRandomAccount();
    }

    // Fehlercodes:
    // 0 = kein fehler
    // 1 = konto nicht gefunden
    // 2 = konto gefunden aber falsche pin
    // 3 = konto gefunden, richtige pin aber konto nicht aktiv
    public int validiereKonto(String kontonummer, String pin){
        return 0;
    }

    private List<Konto> generateRandomAccount(){
        ArrayList<Konto> kontolist = new ArrayList<>();
        String kontonummer = "DE00000001";
        String pin = "1234";
        Double kontostand = Double.valueOf("100");
        kontolist.add(new Konto("Peter Müller", kontonummer, pin, kontostand, true));
        return kontolist;
	}


    public void creatrandacc(){
        
        for (int i = 0;i<5;i++){
            kontoliste.add(new Konto("Person"+i,"DE0000123"+i,"123"+i,1230.00+i,true));
        }
        for (int i = 0;i<3;i++){
            kontoliste.add(new Konto("Person"+i,"DE1111000"+i,"123"+i,1230.00+i,true));
        }
        for (int i = 0;i<2;i++){
            kontoliste.add(new Konto("Person"+i,"US1111081"+i,"123"+i,1230.00+i,true));
        }
    }

    public List<Konto> getKontoliste() {
        return kontoliste;
    }

    public Konto getKonto(String kontoNummer){
        for (Konto i : this.kontoliste){
            if(i.getKontonummer() == kontoNummer){
                return(i);
            }
        }
        return(null);
    }

    @Override
    public String toString() {
        return "Bank [kontoliste=" + kontoliste + "]" + "\n";
    }
}