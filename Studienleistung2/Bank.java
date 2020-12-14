package Studienleistung2;

import java.util.List;

class Bank{
    private List<Konto> kontoliste;

    // Dieser Konstruktor bekommt Konten beim initialisieren übergeben
    public Bank(List<Konto> konten){
        this.kontoliste=konten;
    }

    private boolean validiereKonto(String kontonummer, String pin){
        return false;
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

    @Override
    public String toString() {
        return "Bank [kontoliste=" + kontoliste + "]" + "\n";
    }
}