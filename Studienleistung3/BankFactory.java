package Studienleistung3;

public class BankFactory {

    public Bank getBank(String kontoNummer){
        if(kontoNummer.startsWith("DE0000")){
            //Eigene Bank
            Bank myBank = new EigeneBank();
            return myBank;
        }else if(kontoNummer.startsWith("DE")){
            //Fremdbank inland
            Bank myBank = new Fremdbank();
            //konten hinzufügen
            return myBank;
        
        }else{
            Bank myBank = new FremdbankAusland();
            //konten hinzfügen
            return myBank;

        }
    }
}
