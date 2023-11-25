package Metier;

import Data.IData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{
    public MetierImpl(IData data) {
        this.data = data;
    }

    @Autowired
    @Qualifier("data1")
    private IData data; //couplage faible

   // public void setData(IData data) {
     //   this.data = data;
    //}


    @Override
    public double calcul() {
        double dat = data.getData();
        double res = dat * 15.6;
        return res;
    }
}
