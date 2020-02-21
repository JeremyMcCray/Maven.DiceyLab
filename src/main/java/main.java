public class main {
    public static void main(String[] args) {
//        Dice dice = new Dice(2);
//        Bins bin = new Bins(2,12);
        Simulation sim = new Simulation(2,100);
        sim.runSimulation();
        sim.printResults();
    }
}
