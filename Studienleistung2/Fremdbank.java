package Studienleistung2;

import java.util.List;

public class Fremdbank extends Bank {

    Fremdbank(List<Konto> konten) {
        super(konten);
    }

    int berechneGebuehrinProzent(){
        return 0;
    }
    
}
