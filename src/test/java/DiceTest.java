import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DiceTest {
    private static final Logger LOGGER = Logger.getLogger(DiceTest.class.getName());

   @Test
    public void diceTest(){
        Dice dice = new Dice(2,10);
        //Given

        Integer actual = dice.tossAndSumWithSeed();
        //When

        //Then
        Double expected = 9.0;

        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void binTest(){
        Bins bin = new Bins(2,12);
        bin.incrementBin(2);
        bin.incrementBin(2);
        bin.incrementBin(2);
        bin.incrementBin(2);
       Integer actual = bin.getBinValue(2);
       Integer expected = 4;
       Assert.assertEquals(actual,expected);
    }
    @Test
    public void binTest2(){
        Bins bin = new Bins(2,12);
        bin.incrementBin(3);
        bin.incrementBin(3);
        bin.incrementBin(3);
        bin.incrementBin(3);
        Integer actual = bin.getBinValue(3);
        Integer expected = 4;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void binTester3(){
        Bins bin = new Bins(2,12);
        Integer actual = bin.getBinValue(2);
        Integer expected = 0;

        Assert.assertEquals(actual,expected);

    }


}
