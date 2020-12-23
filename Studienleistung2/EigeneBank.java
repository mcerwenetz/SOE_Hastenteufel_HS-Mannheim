package Studienleistung2;

import java.util.List;

public class EigeneBank extends Bank {

    EigeneBank(){
        super();
        createacc();
    }
    

    int berechneGebuehrinProzent(){
        return 0;
    }

    void createacc(){
        super.kontoliste.add(new Konto("Marius Cerwenetz","DE00001231","1234",650000.00,true));
        super.kontoliste.add(new Konto("Daniel Echt","DE00001232","1235",1000000.00,true));
        super.kontoliste.add(new Konto("Annika Stark","DE00001233","1236",6.50,true));
        super.kontoliste.add(new Konto("Daniel Bender","DE00001234","1237",5.00,true));
        super.kontoliste.add(new Konto("Mark Hastenteufel","DE00001235","0000",0.00,false));
    }
    
}
