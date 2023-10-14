package Metier;

import Data.IData;

public class MetierImpl implements IMetier{

    private IData data; //couplage faible

    public void setData(IData data) {
        this.data = data;
    }

    @Override
    public double calcul() {
        double dat = data.getData();
        double res = dat * 15.6;
        return res;
    }
}
