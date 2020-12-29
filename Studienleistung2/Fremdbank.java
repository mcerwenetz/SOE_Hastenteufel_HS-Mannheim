package Studienleistung2;

import java.util.ArrayList;

public class Fremdbank extends Bank {


    Fremdbank() {
        super();
        super.kontoliste = new ArrayList<>();
        createacc();
        
    }

    int berechneGebuehrinProzent(int betrag){
         return ((int) (betrag * 0.01));
    }

    void createacc(){
        super.kontoliste.add(new Konto("Anne Wandnageln","DE11111231","0001",12345.00,true));
        super.kontoliste.add(new Konto("Willfried Lichwichsen","DE22221232","0002",54321.00,true));
        super.kontoliste.add(new Konto("Willma Besamen","DE44441233","0003",78945.00,true));
        super.kontoliste.add(new Konto("Karl Laschnikow","DE55551234","0004",98745.00,true));
        super.kontoliste.add(new Konto("Peter Silie","DE66661235","0005",6547.00,false));
    }
    
}
