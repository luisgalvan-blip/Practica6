package pract5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pract5.Carta.Figura;

/**
 * Pruebas unitarias para la clase Carta.
 * Valida la correcta representación textual de los valores y figuras.
 * @author Luis Galvan
 * @see Carta
 */
public class CartaTest {

    /**
     * Verifica que el método toString convierta correctamente los valores 
     * numéricos y especiales (como el 1 a 'A' o el 11 a 'J').
     */
    @Test
    void testToString() {
        Carta c1 = new Carta(1, Figura.CORAZON);
        Carta c2 = new Carta(11, Figura.PICA);
        
        assertEquals("A de CORAZON", c1.toString());
        assertEquals("J de PICA", c2.toString());
    }
}
