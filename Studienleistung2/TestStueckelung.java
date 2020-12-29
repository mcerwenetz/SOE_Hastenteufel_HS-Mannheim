package Studienleistung2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;

public class TestStueckelung {
    
    @Before 
	public void setUp() {
        // ignore
	}
	
	@After  
	public void tearDown() {
        //ignore
    }
    
    @Test
    public void fiftyfive(){
        Geldautomat automat = new Geldautomat();
        Geldauszahlung auszahlen = new Geldauszahlung();
        GeldKasette kasette = new GeldKasette();

        automat.stückelung(55, kasette, auszahlen);
        assertEquals(0,auszahlen.getSchein(GeldScheine.ONEHUNDRED));
        assertEquals(1,auszahlen.getSchein(GeldScheine.FIFTY));
        assertEquals(0,auszahlen.getSchein(GeldScheine.TWENTY));
        assertEquals(0,auszahlen.getSchein(GeldScheine.TEN)); 
        assertEquals(1,auszahlen.getSchein(GeldScheine.FIVE));         
    }
    @Test
    public void sixtyfive(){
        Geldautomat automat = new Geldautomat();
        Geldauszahlung auszahlen = new Geldauszahlung();
        GeldKasette kasette = new GeldKasette();

        automat.stückelung(65, kasette, auszahlen);
        assertEquals(0,auszahlen.getSchein(GeldScheine.ONEHUNDRED));
        assertEquals(1,auszahlen.getSchein(GeldScheine.FIFTY));
        assertEquals(0,auszahlen.getSchein(GeldScheine.TWENTY));
        assertEquals(1,auszahlen.getSchein(GeldScheine.TEN)); 
        assertEquals(1,auszahlen.getSchein(GeldScheine.FIVE));       
    }
    @Test
    public void seventy(){
        Geldautomat automat = new Geldautomat();
        Geldauszahlung auszahlen = new Geldauszahlung();
        GeldKasette kasette = new GeldKasette();

        automat.stückelung(70, kasette, auszahlen);
        assertEquals(0,auszahlen.getSchein(GeldScheine.ONEHUNDRED));
        assertEquals(1,auszahlen.getSchein(GeldScheine.FIFTY));
        assertEquals(1,auszahlen.getSchein(GeldScheine.TWENTY));
        assertEquals(0,auszahlen.getSchein(GeldScheine.TEN));
        assertEquals(0,auszahlen.getSchein(GeldScheine.FIVE));       
    }
    @Test
    public void twohundred(){
        Geldautomat automat = new Geldautomat();
        Geldauszahlung auszahlen = new Geldauszahlung();
        GeldKasette kasette = new GeldKasette();

        automat.stückelung(200, kasette, auszahlen);
        assertEquals(0,auszahlen.getSchein(GeldScheine.ONEHUNDRED));
        assertEquals(4,auszahlen.getSchein(GeldScheine.FIFTY));
        assertEquals(0,auszahlen.getSchein(GeldScheine.TWENTY));
        assertEquals(0,auszahlen.getSchein(GeldScheine.TEN));
        assertEquals(0,auszahlen.getSchein(GeldScheine.FIVE));       
    }
    @Test
    public void threehundred(){
        Geldautomat automat = new Geldautomat();
        Geldauszahlung auszahlen = new Geldauszahlung();
        GeldKasette kasette = new GeldKasette();

        automat.stückelung(300, kasette, auszahlen);
        assertEquals(0,auszahlen.getSchein(GeldScheine.ONEHUNDRED));
        assertEquals(6,auszahlen.getSchein(GeldScheine.FIFTY));
        assertEquals(0,auszahlen.getSchein(GeldScheine.TWENTY));
        assertEquals(0,auszahlen.getSchein(GeldScheine.TEN));
        assertEquals(0,auszahlen.getSchein(GeldScheine.FIVE));
        
              
    }
    @Test
    public void threehundredeightyfive(){
        Geldautomat automat = new Geldautomat();
        Geldauszahlung auszahlen = new Geldauszahlung();
        GeldKasette kasette = new GeldKasette();

        automat.stückelung(385, kasette, auszahlen);
        assertEquals(3,auszahlen.getSchein(GeldScheine.ONEHUNDRED));
        assertEquals(1,auszahlen.getSchein(GeldScheine.FIFTY));
        assertEquals(1,auszahlen.getSchein(GeldScheine.TWENTY));
        assertEquals(1,auszahlen.getSchein(GeldScheine.TEN)); 
        assertEquals(1,auszahlen.getSchein(GeldScheine.FIVE));
    }
}