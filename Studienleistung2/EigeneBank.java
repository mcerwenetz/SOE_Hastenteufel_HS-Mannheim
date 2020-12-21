package Studienleistung2;

import java.util.List;

public class EigeneBank extends Bank {

    EigeneBank(List<Konto> konten){
        super(konten);
    }
    

    int berechneGebuehrinProzent(){
        return 0;
    }

    
}
