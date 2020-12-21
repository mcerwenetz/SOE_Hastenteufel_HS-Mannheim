package Studienleistung2;

import java.util.HashMap;

public class Geldauszahlung {
    private HashMap<GeldScheine, Integer> scheine;

    public Geldauszahlung(){
        scheine = new HashMap<GeldScheine, Integer>();
    }

    public boolean addScheine(GeldScheine scheinArt, int anzahl){
        if(this.scheine.putIfAbsent(scheinArt, anzahl) != null){
            this.scheine.put(scheinArt, this.scheine.get(scheinArt) + anzahl);
        }

        return true;
    }

    public int getSchein(GeldScheine scheinArt){
        if(this.scheine.get(scheinArt)==null){
            return 0;
        }else{
            return this.scheine.get(scheinArt);
        }
    }

    public HashMap<GeldScheine, Integer> getScheine() {
        return scheine;
    }

    public void setScheine(HashMap<GeldScheine, Integer> scheine) {
        this.scheine = scheine;
    }

    public int getBetrag(){
        int betrag = 0;
        for (GeldScheine i : this.scheine.keySet()){
            betrag += i.getValue() * this.scheine.get(i);
        }
        return betrag;
    }
}
