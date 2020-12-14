package Studienleistung2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Bank{
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
        return 3;
    }

    private List<Konto> generateRandomAccount(){
        ArrayList<Konto> kontolist = new ArrayList<>();
        HashMap<String,String> zugangsdaten = new HashMap<>();
        String kontonummer = "DE00000001";
        zugangsdaten.put(kontonummer, "1234");
        Double kontostand = Double.valueOf("100");
        kontolist.add(new Konto("Peter Müller", kontonummer,zugangsdaten, kontostand, true));
        return kontolist;
    }

}