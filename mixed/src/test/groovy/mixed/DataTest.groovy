package mixed;

import static org.junit.jupiter.api.Assertions.assertEquals

import org.junit.jupiter.api.Test

class DataTest  {
    
    @Test
    void test01() {
        Data data = new Data(42)
        assertEquals(42, data.getC())
        println("Data 0 ${data}")
        
    }

}
