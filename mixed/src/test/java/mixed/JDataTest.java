package mixed;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JDataTest {

    @Test
    void test01() throws Exception {
        JData jData = new JData(42);
        assertEquals(42, jData.getC());
    }

}
