package Metier;

import Data.DataImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class RtableauAjouterTest {
    private  Rtableau rtableau;
    @Test
    public  void  TestCalcul() {
       rtableau = new Rtableau(5);
        int  excepted = 5;
        double res= rtableau.taille();
        assertTrue(res==excepted);
    }

    @Test
    public  void  TestCalcul2() {
        rtableau = new Rtableau(5);
        int  excepted = 5;
        double res= rtableau.taille();
        assertEquals(5, rtableau.taille());
}
    @Test
    public  void  TestCalcul3() {
        rtableau = new Rtableau(5);
        int excepted = 5;
        double res = rtableau.taille();
        assertSame(5, rtableau.taille());
    }
    @Test
    public  void  TestCalcul7() {
        rtableau = new Rtableau(5);
        int excepted = 5;
        double res = rtableau.taille();
        assertNotSame(2, rtableau.taille());
    }
    @Test
    public  void  TestCalcul4() {
        rtableau = new Rtableau(5);
        int excepted = 5;
        double res = rtableau.taille();
        assertNotEquals(4, rtableau.taille());
    }

    }
