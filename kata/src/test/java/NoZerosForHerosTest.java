import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoZerosForHerosTest {

    @Test
    void test1() {
        assertEquals(145, NoZerosForHeros.noBoringZeros(1450));
        assertEquals(96, NoZerosForHeros.noBoringZeros(960000));
        assertEquals(105, NoZerosForHeros.noBoringZeros(1050));
        assertEquals(-105, NoZerosForHeros.noBoringZeros(-1050));
    }
}