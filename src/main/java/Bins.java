import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class Bins {
    Integer binMin;
    Integer binMax;
    Map<Integer,Integer> diceBin = new HashMap<>();
    private static final Logger LOGGER = Logger.getLogger(Bins.class.getName());
    public Bins(Integer binMin, Integer binMax){


        for (int i = binMin; i <= binMax ; i++) {

            this.diceBin.put(i,0);
        }

    }

    public Integer getBinValue(Integer binNumber){
        return this.diceBin.get(binNumber);
    }


    public Set<Integer> getBinKeySet(){
        return diceBin.keySet();


    }

    public void incrementBin(Integer binNumber){

        Integer count = getBinValue(binNumber)+1;
        diceBin.replace(binNumber,count);
    }
}
