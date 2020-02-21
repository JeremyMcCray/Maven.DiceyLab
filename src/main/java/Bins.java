import java.util.HashMap;
import java.util.logging.Logger;

public class Bins {
    Integer binMin;
    Integer binMax;
    HashMap<Integer,Integer> diceBin = new HashMap<>();

    public Bins(Integer binMin, Integer binMax){


        for (int i = binMin; i <= binMax ; i++) {

            this.diceBin.put(i,0);
        }
    }

    public Integer getBinValue(Integer binNumber){
        return this.diceBin.get(binNumber);
    }


    public Integer getBin(Integer binNumber){
        return diceBin.get(binNumber);
    }

    public void incrementBin(Integer binNumber){

        Integer count = getBinValue(binNumber)+1;
        diceBin.replace(binNumber,count);
    }
}
