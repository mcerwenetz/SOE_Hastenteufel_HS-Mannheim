package Studienleistung3;

import java.util.ArrayList;

public class Fremdbank extends Bank {


    Fremdbank() {
        super();
        super.kontoliste = new ArrayList<>();
        createacc();
        
    }
    @Override
    double berechneGebuehr(int betrag){
         return (betrag * 0.01);
    }

    void createacc(){
        super.kontoliste.add(new Konto("Anna Theke","DE11111231","0001",12345.00,true));
        super.kontoliste.add(new Konto("Axel Höhle","DE22221232","0002",54321.00,true));
        super.kontoliste.add(new Konto("Rainer Zufall","DE44441233","0003",78945.00,true));
        super.kontoliste.add(new Konto("Ernst Fall","DE44441228","0003",78945.00,true));
        super.kontoliste.add(new Konto("Karl Laschnikow","DE55551234","0004",98745.00,true));
        //gesperrtes Konto
        super.kontoliste.add(new Konto("Peter Silie","DE66661235","0005",6547.00,false));
    }
    
}
