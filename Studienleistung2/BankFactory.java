package Studienleistung2;

public class BankFactory {
    
    BankFactory(){

    }

    public Bank createBank(String kontoNummer){
        if(kontoNummer.startsWith("DE1234")){
            //Eigene Bank
            Bank myBank = new EigeneBank();
            //myBank.addKonto(......);
            //myBank.addKonto(......);
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
