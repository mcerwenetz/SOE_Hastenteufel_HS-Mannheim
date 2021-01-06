package Studienleistung2;

public class Konto {

    private final String KONTOINHABER;
    private final String KONTONUMMER;
    private final String PIN;
    protected Double kontostand;
    protected Boolean isaktiv;

    public Konto(String kontoinhaber,String kontonummer,String pin,Double kontostand,Boolean aktiv){
        this.KONTOINHABER = kontoinhaber;
        this.KONTONUMMER = kontonummer;        
        this.PIN = pin;
        this.kontostand = kontostand;
        this.isaktiv = aktiv;
    }

    public String getKontoinhaber() {
        return KONTOINHABER;
    }

    public String getKontonummer() {
        return KONTONUMMER;
    }

    public String getPin() {
        return PIN;
    }

    public boolean abbuchen(Double betrag){

        if ((kontostand-betrag) < 0){
            return false;
        }
        kontostand-=betrag;
        return true;
    }

    public Double getKontostand() {
        return kontostand;
    }

    public Boolean getIsaktiv() {
        return isaktiv;
    }

    public void setIsaktiv(Boolean isaktiv) {
        this.isaktiv = isaktiv;
    }

    @Override
    public String toString() {
        return "Konto [kontoinhaber=" + KONTOINHABER + ", kontonummer=" + KONTONUMMER
                + ", kontostand=" + kontostand + ", zugangsdaten=" + PIN + ", aktiv=" + isaktiv + "]" + "\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isaktiv == null) ? 0 : isaktiv.hashCode());
        result = prime * result + ((KONTOINHABER == null) ? 0 : KONTOINHABER.hashCode());
        result = prime * result + ((KONTONUMMER == null) ? 0 : KONTONUMMER.hashCode());
        result = prime * result + ((kontostand == null) ? 0 : kontostand.hashCode());
        result = prime * result + ((PIN == null) ? 0 : PIN.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Konto other = (Konto) obj;
        if (isaktiv == null) {
            if (other.isaktiv != null)
                return false;
        } else if (!isaktiv.equals(other.isaktiv))
            return false;
        if (KONTOINHABER == null) {
            if (other.KONTOINHABER != null)
                return false;
        } else if (!KONTOINHABER.equals(other.KONTOINHABER))
            return false;
        if (KONTONUMMER == null) {
            if (other.KONTONUMMER != null)
                return false;
        } else if (!KONTONUMMER.equals(other.KONTONUMMER))
            return false;
        if (kontostand == null) {
            if (other.kontostand != null)
                return false;
        } else if (!kontostand.equals(other.kontostand))
            return false;
        if (PIN == null) {
            if (other.PIN != null)
                return false;
        } else if (!PIN.equals(other.PIN))
            return false;
        return true;
    }
}