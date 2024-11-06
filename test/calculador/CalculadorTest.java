
package calculador;

import org.junit.*;
import static org.junit.Assert.*;


public class CalculadorTest {
    
 private static Calculador calculador;

    @BeforeClass
    public static void beforeClass() {
        calculador = new Calculador();
        System.out.println("Bienvenido a las pruebas de la clase Calculador");
    }

    @Before
    public void setUp() {
        // Imprimimos el nombre del método antes de ejecutarlo
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void testSumar() {
        double resultado = calculador.sumar(3.5, 2.5);
        assertEquals(6.0, resultado, 0.001);
    }

    @Test
    public void testRestar() {
        double resultado = calculador.restar(5.0, 3.0);
        assertEquals(2.0, resultado, 0.001);
    }

    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("La operación ha finalizado");
    }
    
}
