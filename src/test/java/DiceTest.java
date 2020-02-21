import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    @Test

    public void diceTest(){
        Dice dice = new Dice(2,10);
        //Given

        Integer actual = dice.tossAndSumWithSeed();
        //When

        //Then
        Double expected = 8.0;

        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void binTest(){
        Bins bin = new Bins(2,12);
        bin.incrementBin(2);
       Integer actual = bin.getBinValue(2);
       Integer expected = 1;
       Assert.assertEquals(actual,expected);
    }
}
