package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {

            ApplicationContext springContext = new AnnotationConfigApplicationContext("data","metier");
            IMetier metier = (IMetier) springContext.getBean(IMetier.class);
            System.out.println("RES= "+metier.calcul());
    }
}
