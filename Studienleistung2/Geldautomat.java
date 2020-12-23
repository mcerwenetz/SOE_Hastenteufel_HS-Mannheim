package Studienleistung2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Geldautomat {

    // private GeldKasette GeldKasette;
    private boolean keepRunning;
    private BankFactory bankFactory;
    private Bank bank;
    private int fehlversuche;
    private final Scanner scan;
    private String kontonummer;

    public Geldautomat(){
        this.scan = new Scanner(System.in);
    }

    public void startSession(){
        //this.bank = new Bank();
        this.fehlversuche = 0;
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

    public String kontostandAnsehen(){
        double kontostand = this.bank.getKonto((String)this.kontonummer).getKontostand();
        DecimalFormat df = new DecimalFormat("0.00");
        return(df.format(kontostand));
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
            this.bankFactory = new BankFactory();
            this.bank = this.bankFactory.getBank(kontonummer);
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
        System.out.println("Sie wurden Authentifiziert\n");
        // Betrag stückeln, Stückelung bei Geldkasette anfragen
        // Wenn alles wahr, dann true zurückgeben für "geld ausgezahlt"
        Geldauszahlung auszahlen = new Geldauszahlung();
        GeldKasette kasette = new GeldKasette();

            System.out.println("Möchten Sie die Scheinart wählen oder eine Automatische Stückelung?\n");
            System.out.println("(1) Scheinart auswählen");
            System.out.println("(2) Automatische Stückelung\n");
            String menuauswahl = this.scan.next();

            if (menuauswahl.equals("1")){
                System.out.println("\nDer Minimalbetrag liebt bei 50€, der Maximalbetrag bei 500€");
                System.out.println("(1) 5€ Schein\n(2) 10€ Schein\n(3) 20€ Schein\n(4) 50€ Schein\n(5) 100€ Schein\n(0) Eingabe beenden");
                System.out.println("Bsp.: Möchten Sie zwei 50€ Scheine, so wählen Sie zwei mal Menüpunkt 4");
                int scheinwahl;
                
                while (auszahlen.getBetrag() < 500){
                    System.out.println("Betrag: " + auszahlen.getBetrag());
                    scheinwahl = this.scan.nextInt();

                    if (scheinwahl==1){
                        if ((auszahlen.getBetrag()+GeldScheine.FIVE.getValue())<=500){
                            auszahlen.addScheine(GeldScheine.FIVE, 1);
                        }
                        else {
                            break;
                        }
                    }
                    else if (scheinwahl==2){
                        if ((auszahlen.getBetrag()+GeldScheine.TEN.getValue())<=500){
                            auszahlen.addScheine(GeldScheine.TEN, 1);
                        }
                        else {
                            break;
                        }
                    }
                    else if (scheinwahl==3){
                        if ((auszahlen.getBetrag()+GeldScheine.TWENTY.getValue())<=500){
                            auszahlen.addScheine(GeldScheine.TWENTY, 1);
                        }
                        else {
                            break;
                        }
                    }
                    else if (scheinwahl==4){       
                        if ((auszahlen.getBetrag()+GeldScheine.FIFTY.getValue())<=500){
                            auszahlen.addScheine(GeldScheine.FIFTY, 1);
                        }
                        else {
                            break;
                        }
                    }
                    else if (scheinwahl==5){
                        if ((auszahlen.getBetrag()+GeldScheine.ONEHUNDRED.getValue())<=500){
                            auszahlen.addScheine(GeldScheine.ONEHUNDRED, 1);
                        }
                        else {
                            break;
                        }
                    }
                    else if (scheinwahl == 0){
                        if (auszahlen.getBetrag()<50 || auszahlen.getBetrag() > 500){
                            System.out.println("Betrag unter 50€ oder über 500€!");
                        }
                        else if(auszahlen.getBetrag()>=50){
                            kasette.auszahlen(auszahlen);
                            break;
                        }
                    }
                }    
            }         
            else if(menuauswahl.equals("2")){
                System.out.println("\nDer Minimalbetrag liebt bei 50€, der Maximalbetrag bei 500€");
                System.out.println("Bitte geben Sie den gewünschten Betrag ein:");
                int betrag = scan.nextInt();
                stückelung(betrag,kasette,auszahlen);
            }
        }
        return false;
    }

    void stückelung(int betrag, GeldKasette kasette,Geldauszahlung auszahlen){
                        
        while (auszahlen.getBetrag() <= 50){
            if (betrag > 50 && betrag%5==0 && betrag <= 500){
                if (betrag > 300){
                    betrag = naechsterSchein(auszahlen, GeldScheine.ONEHUNDRED, betrag);
                }
                betrag = naechsterSchein(auszahlen, GeldScheine.FIFTY, betrag);
                betrag = naechsterSchein(auszahlen, GeldScheine.TWENTY, betrag);
                betrag = naechsterSchein(auszahlen, GeldScheine.TEN, betrag);
                betrag = naechsterSchein(auszahlen, GeldScheine.FIVE, betrag);
            }
        kasette.auszahlen(auszahlen);  
        }
    }
    
    int naechsterSchein(Geldauszahlung auszahlung, GeldScheine schein, int betrag){
        while(betrag-schein.getValue()>=0){
            auszahlung.addScheine(schein, 1);
            betrag -= schein.getValue();
        }
        return (betrag);
    }
    
    public void beenden(){
        this.keepRunning=false;
        this.scan.close();
    }

}