package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChocolateBagsBeforeBoundaryTest {
    @Test
    public void totalIsBiggerThanAmountOfBars() {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(1, 1, 10);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void onlyBigBars() {
        int result = new ChocolateBags().calculate(5, 3, 10);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void bigAndSmallBars() {
        int result = new ChocolateBags().calculate(5, 3, 17);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void onlySmallBars() {
        int result = new ChocolateBags().calculate(4, 2, 3);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void prueba1() {
        int result = new ChocolateBags().calculate(2, 3, 20);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void prueba2() {
        int result = new ChocolateBags().calculate(8, 2, 16);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void prueba3() {
        int result = new ChocolateBags().calculate(3, 1, 8);
        Assertions.assertEquals(3, result);
    }
}
