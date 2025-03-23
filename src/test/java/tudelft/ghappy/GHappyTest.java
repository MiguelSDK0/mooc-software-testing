package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void prueba_1() {
        GHappy gh = new GHappy();
        boolean resultado = gh.gHappy("ggxx");
        Assertions.assertEquals(true, resultado);
    }
    @Test
    public void prueba_2() {
        GHappy gh = new GHappy();
        boolean resultado = gh.gHappy("xggxgx");
        Assertions.assertEquals(false, resultado);
    }
    @Test
    public void prueba_3() {
        GHappy gh = new GHappy();
        boolean resultado = gh.gHappy("xgxx");
        Assertions.assertEquals(false, resultado);
    }
}
