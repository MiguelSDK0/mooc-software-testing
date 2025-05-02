package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void test1() {
        Mirror m = new Mirror();
        Assertions.assertEquals("ab", m.mirrorEnds("abXYZba"));
    }

    @Test
    public void test2() {
        Mirror m = new Mirror();
        Assertions.assertEquals("a", m.mirrorEnds("abca"));
    }

    @Test
    public void test3() {
        Mirror m = new Mirror();
        Assertions.assertEquals("aba", m.mirrorEnds("aba"));
    }

    @Test
    public void test4() {
        Mirror m = new Mirror();
        Assertions.assertEquals("", m.mirrorEnds(""));
    }

    @Test
    public void test5() {
        Mirror m = new Mirror();
        Assertions.assertEquals("abba", m.mirrorEnds("abba"));
    }

    @Test
    public void test6() {
        Mirror m = new Mirror();
        Assertions.assertEquals("abcba", m.mirrorEnds("abcba"));
    }

    @Test
    public void test7() {
        Mirror m = new Mirror();
        Assertions.assertEquals("", m.mirrorEnds("xyz"));
    }

    @Test
    public void test8() {
        Mirror m = new Mirror();
        Assertions.assertEquals("x", m.mirrorEnds("x"));
    }
}
