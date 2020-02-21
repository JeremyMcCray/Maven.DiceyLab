public class Simulation {

    Integer diceTossed;
    Integer numberOfTosses;
    String results;
    public Simulation(Integer diceTossed, Integer numberOfTosses){
        this.numberOfTosses = numberOfTosses;
        this.diceTossed = diceTossed;
    }

    public void runSimulation(){
        Dice dice = new Dice(diceTossed);
        Bins bin = new Bins(2,diceTossed*6);
        for (int i = 0; i <= numberOfTosses; i++) {
           Integer binToIncrement = dice.tossAndSum();
           bin.incrementBin(binToIncrement);
        }

    }
}
