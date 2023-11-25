package Metier;

import Data.DataImpl;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MetierImplCalculTest {
    private  MetierImpl metierImpl;
    private DataImpl data = new DataImpl();
    @Test
    public  void  TestCalcul() {
        metierImpl = new MetierImpl(new DataImpl());
        double Data = data.getData();
        double excepted = Data * 15.6;
        double res= metierImpl.calcul();
        assertTrue(res==excepted);

    }

}
