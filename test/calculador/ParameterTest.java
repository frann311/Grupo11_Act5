/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculador;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterTest {
    private final double a;
    private final double b;
    private final double esperado;
    private final Calculador calc = new Calculador();

    public ParameterTest(double a, double b, double esperado) {
        this.a = a;
        this.b = b;
        this.esperado = esperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {
                {8, 7, 15},
                {2, 0, 20},
                {10, -1, -9}
        });
    }

    @Test
    public void testSumaParametrizada() {
        assertEquals(esperado, calc.sumar(a, b), 0.001);
    }
}


