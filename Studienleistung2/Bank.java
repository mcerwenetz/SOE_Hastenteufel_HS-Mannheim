package Studienleistung2;

import java.util.List;

class Bank{
    private List<Konto> kontoliste;

    // Dieser Konstruktor bekommt Konten beim initialisieren übergeben
    public Bank(List<Konto> konten){
        this.kontoliste=konten;
    }

    // Dieser Konstruktor erstellt selbst neue Konten zum Testen
    public Bank(){
        this.kontoliste = Konto.createTenRandomAccounts();
    }

    private boolean validiereKonto(String kontonummer, String pin){
        return false;
    }

    public List<Konto> getKontoliste() {
        return kontoliste;
    }

    @Override
    public String toString() {
        return "Bank [kontoliste=" + kontoliste + "]" + "\n";
    }
}