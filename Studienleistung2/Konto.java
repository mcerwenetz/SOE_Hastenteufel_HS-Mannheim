
public class Konto{

    private final String kontoinhaber;
    private final String kontonummer;
    private final String pin;
    protected Double kontostand;
    protected Boolean isaktiv;

    public Konto(String kontoinhaber,String kontonummer,String pin,Double kontostand,Boolean aktiv){
        this.kontoinhaber = kontoinhaber;
        this.kontonummer = kontonummer;        
        this.pin = pin;
        this.kontostand = kontostand;
        this.isaktiv = aktiv;
    }

    public String getKontoinhaber() {
        return kontoinhaber;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public String getPin() {
        return pin;
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
        return "Konto [kontoinhaber=" + kontoinhaber + ", kontonummer=" + kontonummer
                + ", kontostand=" + kontostand + ", zugangsdaten=" + pin + ", aktiv=" + isaktiv + "]" + "\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isaktiv == null) ? 0 : isaktiv.hashCode());
        result = prime * result + ((kontoinhaber == null) ? 0 : kontoinhaber.hashCode());
        result = prime * result + ((kontonummer == null) ? 0 : kontonummer.hashCode());
        result = prime * result + ((kontostand == null) ? 0 : kontostand.hashCode());
        result = prime * result + ((pin == null) ? 0 : pin.hashCode());
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
        if (kontoinhaber == null) {
            if (other.kontoinhaber != null)
                return false;
        } else if (!kontoinhaber.equals(other.kontoinhaber))
            return false;
        if (kontonummer == null) {
            if (other.kontonummer != null)
                return false;
        } else if (!kontonummer.equals(other.kontonummer))
            return false;
        if (kontostand == null) {
            if (other.kontostand != null)
                return false;
        } else if (!kontostand.equals(other.kontostand))
            return false;
        if (pin == null) {
            if (other.pin != null)
                return false;
        } else if (!pin.equals(other.pin))
            return false;
        return true;
    }
}