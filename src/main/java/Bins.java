import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class Bins {

    Map<Integer,Integer> diceBin = new HashMap<>();
    private static final Logger LOGGER = Logger.getLogger(Bins.class.getName());

    public Bins(Integer binMin, Integer binMax){


        for (int i = binMin; i <= binMax ; i++) {

            this.diceBin.put(i,0);
        }

    }

    public Integer getBinValue(Integer binNumber){
        return diceBin.get(binNumber);
    }


    public Set<Integer> getBinKeySet(){
        return diceBin.keySet();


    }

    public Map<Integer, Integer>  getBinMap(){return this.diceBin;}

    public void incrementBin(Integer binNumber){

        if (getBinMap().containsKey(binNumber)) {
            Integer count = getBinValue(binNumber) + 1;
            this.diceBin.put(binNumber, count);
        }
    }
}
