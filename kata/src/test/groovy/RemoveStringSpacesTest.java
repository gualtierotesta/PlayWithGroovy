import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveStringSpacesTest {

    @Test
    void test1() {
        System.out.println(RemoveStringSpaces.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assert "8j8mBliB8gimjB8B8jlB".equals(RemoveStringSpaces.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assert "88Bifk8hB8BB8BBBB888chl8BhBfd".equals(RemoveStringSpaces.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assert "8aaaaaddddr".equals(RemoveStringSpaces.noSpace("8aaaaa dddd r     "));
        assert "jfBmgklf8hg88lbe8".equals(RemoveStringSpaces.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assert "8jaam".equals(RemoveStringSpaces.noSpace("8j aam"));
    }

}