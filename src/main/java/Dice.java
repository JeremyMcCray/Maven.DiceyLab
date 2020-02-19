import java.util.Random;

public class Dice {
    Integer numOfDice;
    public Dice(Integer numOfDice){
        this.numOfDice=numOfDice;
    }

    public Integer tossAndSum(){
        Random random = new Random();
        Integer sumOfDice = 0;
        for (int i = 0; i <= numOfDice ; i++) {
            sumOfDice+=random.nextInt(6)+1;
        }

        return sumOfDice;
    }

}
