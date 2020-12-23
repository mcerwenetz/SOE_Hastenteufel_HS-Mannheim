package Studienleistung2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestStueckelung {
    
    @Before 
	public void setUp() {
        // ignore
	}
	
	@After  
	public void tearDown() {
		// ignore
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
    /*public static class TestHelloWatcher extends TestWatcher {
        @Override
        protected void starting(Description description) {
                String name = description.getMethodName();
                System.out.format("Test: %s\n", name);
        }
        @Override
        protected void succeeded(Description description) {                     
        }
        protected void failed(Throwable e, Description description) {
                String name = description.getMethodName();
                System.out.format("Error: %s\n", name);                 
                System.out.println(e.getMessage());
                System.out.println(e.toString());
        }
    }

    @Rule
    public TestRule watcher = new TestHelloWatcher();

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestStueckelung.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }*/
}