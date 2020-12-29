package Studienleistung2;

public class GeldKasette implements IGeldKasette {
    public GeldKasette(){
    }
    
    public boolean auszahlen(Geldauszahlung auszahlung){
        System.out.println("*Geldkasette Rattert*");
        System.out.println("*Geldkasette zahlt: " + String.format("%d ",auszahlung.getScheine().get(GeldScheine.FIVE)) + "Fünfer, " + String.format("%d ",auszahlung.getScheine().get(GeldScheine.TEN)) + "Zehner, " + String.format("%d ",auszahlung.getScheine().get(GeldScheine.TWENTY)) + "Zwanziger, " + String.format("%d ",auszahlung.getScheine().get(GeldScheine.FIFTY)) + "Fünfziger, " +String.format("%d ",auszahlung.getScheine().get(GeldScheine.ONEHUNDRED)) + "Hunderter, " + String.format("%d ",auszahlung.getScheine().get(GeldScheine.TWOHUNDRED)) + "Zweihunderter! \n");
        return true;
    }

}
