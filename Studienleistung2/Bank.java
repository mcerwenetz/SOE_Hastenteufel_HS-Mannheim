package Studienleistung2;

import java.util.List;


abstract class Bank{
    protected List<Konto> kontoliste;

    public Bank(){

    }
   
    // Returncodes:
    // 0 = kein fehler
    // 1 = konto nicht gefunden
    // 2 = konto gefunden aber falsche pin
    // 3 = konto gefunden, richtige pin aber konto nicht aktiv
    public int validiereKonto(String kontonummer, String pin){
        Konto k = this.getKonto(kontonummer);
        if(k != null){
            // Konto gefunden
            if(k.getPin().equals(pin)){
                //Pin richtig
                if(k.getIsaktiv()){
                    //Konto aktiv
                    return 0;
                }else{
                    //Konto inaktiv
                    return 3;
                }
            }else{
                //pin falsch
                return 2;
            }
        }
        else{
            return 1;
        }
        
    }

    abstract double berechneGebuehr(int betrag);

    public List<Konto> getKontoliste() {
        return kontoliste;
    }

    public Konto getKonto(String kontoNummer){
        for (Konto i : this.kontoliste){
            if(i.getKontonummer().equals(kontoNummer)){
                return(i);
            }
        }
        return(null);
    }

    @Override
    public String toString() {
        return "Bank [kontoliste=" + kontoliste + "]" + "\n";
    }

	public void sperreKonto(String kontonummer) {
        for(Konto k : this.kontoliste){
            if(k.getKontonummer().equals(kontonummer)){
                k.setIsaktiv(false);
            }
        }
	}
}