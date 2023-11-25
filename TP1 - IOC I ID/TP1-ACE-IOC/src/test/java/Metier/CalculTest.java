package Metier;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculTest {
    private  Calculatrice calcul;
    @Test
    public  void  TestSomme() {
        calcul = new Calculatrice();
        double  a=5;
        double b=9;
        double excepted = 14;
double res= calcul.somme(a,b);
        assertTrue(res==excepted);
    }
    @Test
    public  void  TestSubstract() {
        calcul = new Calculatrice();
        double  a=5;
        double b=4;
        double excepted = 1;
        double res= calcul.substract(a,b);
        assertTrue(res==excepted);
    }
    @Test
    public  void  TestMultiplication() {
        calcul = new Calculatrice();
        double  a=3;
        double b=3;
        double excepted = 9;
        double res= calcul.mult(a,b);
        assertTrue(res==excepted);
    }
    @Test
    public  void  TestDivision() {
        calcul = new Calculatrice();
        double  a=4;
        double b=2;
        double excepted = 2;
        double res= calcul.divison(a,b);
        assertTrue(res==excepted);
    }
}
