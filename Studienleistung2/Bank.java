package Studienleistung2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


abstract class Bank{
    protected List<Konto> kontoliste;

    // Dieser Konstruktor bekommt Konten beim initialisieren übergeben
    public Bank(List<Konto> konten){
        this.kontoliste=konten;
    }
    // Fehlercodes:
    // 0 = kein fehler
    // 1 = konto nicht gefunden
    // 2 = konto gefunden aber falsche pin
    // 3 = konto gefunden, richtige pin aber konto nicht aktiv
    public int validiereKonto(String kontonummer, String pin){
        return 0;
    }

    public List<Konto> getKontoliste() {
        return kontoliste;
    }

    @Override
    public String toString() {
        return "Bank [kontoliste=" + kontoliste + "]" + "\n";
    }
}