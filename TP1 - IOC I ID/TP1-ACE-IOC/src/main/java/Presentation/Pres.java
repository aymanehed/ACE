package Presentation;

import Data.DataImpl;
import Data.IData;
import Metier.IMetier;
import Metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres {
    IMetier metier;

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        IData data = new DataImpl();
//        MetierImpl metier = new MetierImpl();
//
//        metier.setData(data);
//
//        System.out.println("RESPONSE: " + metier.calcul());

//        Partie 2
//        Scanner scanner =new Scanner(new File("config.txt"));
//        Class<?> cData = Class.forName(scanner.nextLine()); //toutes les classes sont charge en memoire sous forme d'un objet de type class
//        IData data=(IData)cData.getConstructor().newInstance(); //=> new DataImpl
//        System.out.println(data.getData());
//
//        //Metier
//
//        String metierClassName= scanner.nextLine();
//        Class<?> cMetier = Class.forName(metierClassName);
//        MetierImpl metier= (MetierImpl) cMetier.getConstructor().newInstance();
//        metier.setData(data);
//        System.out.println("RESPONSE: " + metier.calcul());

        //        Partie 3
        Scanner scanner = new Scanner(System.in); // Create a Scanner to read user input

        System.out.print("Enter the data class name: ");
        String dataClassName = scanner.nextLine();
        Class<?> cData = Class.forName(dataClassName);
        IData data = (IData) cData.getConstructor().newInstance();
        System.out.println(data.getData());

         //Metier

        System.out.print("Enter the metier class name: ");
        String metierClassName = scanner.nextLine();
        Class<?> cMetier = Class.forName(metierClassName);
        MetierImpl metier = (MetierImpl) cMetier.getConstructor(IData.class).newInstance(data);
//        MetierImpl metier= (MetierImpl) cMetier.getConstructor().newInstance();
//        metier.setData(data);

        //Method setData = cMetier.getDeclaredMethod("setData", IData.class);
        //setData.invoke(metier, data);
        System.out.println("RESPONSE: " + metier.calcul());
    }
}
