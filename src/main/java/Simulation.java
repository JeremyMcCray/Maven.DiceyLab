import java.util.logging.Level;
import java.util.logging.Logger;

public class Simulation {

    Integer numOfDice;
    Integer numberOfTosses;
    String results;
    Dice dice;
    Bins bin;
    private static final Logger LOGGER = Logger.getLogger(Simulation.class.getName());

    public Simulation(Integer numOfDice, Integer numberOfTosses){
        this.numberOfTosses = numberOfTosses;
        this.numOfDice = numOfDice;
        this.bin = new Bins(numOfDice,numOfDice*6);
        this.dice = new Dice(numOfDice);
    }


    public void runSimulation(){


        for (int i = 0; i <= numberOfTosses; i++) {
           Integer binToIncrement = dice.tossAndSum();
            bin.incrementBin(binToIncrement);
        }

    }

    public void printResults(){
      LOGGER.log(Level.INFO,bin.getBinKeySet() +"");


    }
}
