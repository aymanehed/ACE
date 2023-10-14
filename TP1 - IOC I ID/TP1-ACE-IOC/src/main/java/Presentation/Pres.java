package Presentation;

import Data.DataImpl;
import Data.IData;
import Metier.IMetier;
import Metier.MetierImpl;

public class Pres {
    IMetier metier;

    public static void main(String[] args) {
        IData data = new DataImpl();
        MetierImpl metier = new MetierImpl();

        metier.setData(data);

        System.out.println("RESPONSE: " + metier.calcul());
    }
}
