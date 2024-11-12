import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JavaClassTest {

    @Test
    void testMet() {
        JavaClass sut = new JavaClass();
        String result = sut.met();
        Assertions.assertEquals(result, "hello from Java");
    }
}
