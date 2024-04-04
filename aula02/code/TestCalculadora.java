import org.junit.*;

import static org.junit.Assert.assertNotNull;

import java.io.Console;

public class TestCalculadora {

    @Test
    public void testSimpleSums() {
        int var1 = 10, var2 = 74;
        assert Calculadora.soma(var1, var2) == 84;
    }

    @Test
    public void testSymmetricalValues() {
        int var1 = 5, var2 = -5;
        assert Calculadora.soma(var1, var2) == 0;
    }

    @Test
    public void testWithMaxValuePlusOne() {
        int var1 = Integer.MAX_VALUE, var2 = 1;
        int sum = Calculadora.soma(var1, var2);
        assert sum == 0;

    }
}
