package Studienleistung2;

import java.util.Scanner;

public class Geldautomat {

    // private GeldKasette GeldKasette;
    private boolean keepRunning;
    private Bank bank;
    private int fehlversuche;
    private Scanner scan;
    private String kontonummer;

    public void startSession(){
        this.bank = new Bank();
        this.fehlversuche = 0;
        this.scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("Willkommen bei der Q-Bank\n");
        sb.append("Wie kann ich ihnen helfen\n");
        sb.append("(1) Kontostand ansehen\n");
        sb.append("(2) Geld abheben\n");
        sb.append("(0) Beenden\n");
        this.keepRunning=true;
        while(keepRunning){
            System.out.println(sb);

            String menuepunktAuswahl = this.scan.next();

            if(menuepunktAuswahl.equals("1")){
                kontostandAnsehen();
            }
            else if (menuepunktAuswahl.equals("2")){
                geldAuszahlen();
            }
            else if (menuepunktAuswahl.equals("0")){
                beenden();
            }
            else {
                System.out.println("Falsche eingabe");
            }

        }
    }

    public double kontostandAnsehen(){
        return 0;
    }

    private boolean authentifizierung(){
        StringBuilder geldAbhebenDialog = new StringBuilder("Sie wollen Geld abheben?\n");
        geldAbhebenDialog.append("Geben Sie ihre Kontonumer ein\n");
        String pinEingabeDialog = "Bitte geben Sie ihre PIN ein";
        while(this.fehlversuche < 3){
            System.out.println(geldAbhebenDialog);
            String kontonummer = this.scan.next();
            System.out.println(pinEingabeDialog);
            String pin = this.scan.next();
            int valid = this.bank.validiereKonto(kontonummer, pin);
            if (valid == 0){
                this.kontonummer = kontonummer;
                return true;
            }
            if (valid == 1){
                System.out.println("Konto konnte nicht gefunden werden");
            }
            else if(valid == 2){
                this.fehlversuche++;
                System.out.println("Falsche PIN");
                System.out.println(String.format("Verbleibende versuche: %d", (3-this.fehlversuche)));
                if(this.fehlversuche == 3){
                    System.out.println("Zu viele Fehlversuche\n Sperre Konto");
                    this.fehlversuche=0;
                    // bank.sperreKonto(kontonummer);
                    return false;
                }
            }
            else if(valid == 3){
                System.out.println("Konto ist gesperrt");
                return false;
            }
            System.out.println("(1)Neuer Versuch\n(2)Beenden");
            String auswahl = this.scan.next();
            if(auswahl.equals("1"))
            {
                continue;
            }
            else if(auswahl.equals("2"))
            {
                break;
            }
        }
        return false;
    }

    public boolean geldAuszahlen(){
        if(this.authentifizierung() && this.kontonummer != null){
            System.out.println("Sie wurden Authentifiziert");
            // Betrag stückeln, Stückelung bei Geldkasette anfragen
            // Wenn alles wahr, dann true zurückgeben für "geld ausgezahlt"
        }
        return false;

    }

    public void beenden(){
        this.keepRunning=false;
    }

}