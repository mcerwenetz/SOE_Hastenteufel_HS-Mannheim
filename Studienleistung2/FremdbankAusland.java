package Studienleistung2;

import java.util.List;

public class FremdbankAusland extends Bank {

    FremdbankAusland(List<Konto> konten){
        super(konten);
    }

    int berechneGebuehrinProzent(){
        return 0;
    }    
}
