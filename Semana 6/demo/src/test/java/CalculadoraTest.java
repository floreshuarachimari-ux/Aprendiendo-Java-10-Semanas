import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class CalculadoraTest 
{
    Calculadora calc = new Calculadora();
    @Test
    void sumarDosPositivos() 
    {
        assertEquals(10, calc.sumar(7, 3));
    }
    @Test
    void sumarConNegativo() 
    {
        assertEquals(2, calc.sumar(5, -3));
    }
    @Test
    void sumarConCeros() 
    {
        assertEquals(0, calc.sumar(0, 0));
    }
}