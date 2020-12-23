package Studienleistung2;

public class BankFactory {
    
    BankFactory(){

    }

    public Bank getBank(String kontoNummer){
        if(kontoNummer.startsWith("DE0000")){
            //Eigene Bank
            Bank myBank = new EigeneBank(null);
            //myBank.addKonto(......);
            //myBank.addKonto(......);
            return myBank;
        }else if(kontoNummer.startsWith("DE")){
            //Fremdbank inland
            Bank myBank = new Fremdbank(null);
            //konten hinzufügen
            return myBank;
        
        }else{
            Bank myBank = new FremdbankAusland(null);
            //konten hinzfügen
            return myBank;

        }
    }
}
