package Data;

public class DataImpl implements IData{
    @Override
    public double getData() {
        System.out.println("Recuperation de la Base donnees");
        double data = 10;
        return data;
    }
}
