package Studienleistung2;

import java.util.ArrayList;

public class FremdbankAusland extends Bank {

    FremdbankAusland(){
        super();
        super.kontoliste = new ArrayList<>();
        createacc();
    }

    int berechneGebuehrinProzent(){
        return 0;
    }
    
    void createacc(){
        super.kontoliste.add(new Konto("Juan Son","EN99991231","1000",120000.00,true));
        super.kontoliste.add(new Konto("Wod Katitten","RU99999999","2000",1000400.00,true));
        super.kontoliste.add(new Konto("Marie Joanna","NL04200420","0420",23.50,true));
        super.kontoliste.add(new Konto("Vick Inger","NO58581235","0815",7852.00,true));
        super.kontoliste.add(new Konto("Klaus Uhr","HE66606660","0666",1.00,false));
    }
}
