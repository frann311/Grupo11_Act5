
package calculador;

import org.junit.*;
import static org.junit.Assert.*;

public class DivisionTest {
    static Calculador calc;
    
    @BeforeClass
    public static  void beforeClass(){
        calc = new Calculador();
    }
    @Test(expected = ArithmeticException.class)
    public void testDivisionCero() {
        calc.div(5, 0);
    }
    
}
