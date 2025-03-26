package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void prueba1() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("abc", 3);
        Assertions.assertEquals("def", result);
    }
    @Test
    public void prueba2() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("xyz", 3);
        Assertions.assertEquals("abc", result);
    }
}
