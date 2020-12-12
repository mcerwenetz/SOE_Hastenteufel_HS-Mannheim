package Studienleistung2;

import java.util.List;

class Bank{
    private List<Konto> kontoliste;

    public Bank(List<Konto> konten){
        this.kontoliste=konten;
    }

    private boolean validiereKonto(String kontonummer, String pin){
        return false;
    }

}