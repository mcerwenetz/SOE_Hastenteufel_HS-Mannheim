package Studienleistung2;

import java.util.Scanner;

public class Geldautomat {

    private GeldKasette GeldKasette;
    private boolean keepRunning;

    public void startSession(){
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        this.keepRunning=true;
        while(keepRunning){
            sb.append("Willkommen bei der Q-Bank\n");
            sb.append("Wie kann ich ihnen helfen\n");
            sb.append("(1) Kontostand ansehen\n");
            sb.append("(2) Geld abheben\n");
            sb.append("(0) Beenden\n");
            
            System.out.println(sb);

            String menuepunktAuswahl = scan.next();

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

    public boolean geldAuszahlen(){
        // Auswahl der Menüpunkte
        // Authentifizierung
        return false;
    }

    public void beenden(){
        System.out.println("beende");
        this.keepRunning=false;
    }
}