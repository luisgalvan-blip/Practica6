package pract5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pract5.Carta.Figura;
import java.util.ArrayList;

/**
 * Clase de prueba para verificar el comportamiento de la clase Jugador.
 * Se enfoca en la gestión de la mano y la información del usuario.
 * @author Luis Galvan
 * @version 1.0
 * @see Jugador
 */
public class JugadorTest {

    /**
     * Verifica que el jugador pueda recibir una colección de cartas 
     * y que estas se integren correctamente a su información.
     */
    @Test
    void testRecibirCartas() {
        Jugador j = new Jugador("Luis");
        ArrayList<Carta> cartasNuevas = new ArrayList<>();
        cartasNuevas.add(new Carta(2, Figura.DIAMANTE));
        
        j.recibirCartas(cartasNuevas);
        assertTrue(j.getInformacion().contains("Luis"));
        assertTrue(j.getInformacion().contains("2 de DIAMANTE"));
    }

    /**
     * Prueba la capacidad del jugador para desprenderse de una carta específica
     * de su mano basándose en un índice.
     */
    @Test
    void testDeshacerseDeCarta() {
        Jugador j = new Jugador("Luisa");
        ArrayList<Carta> cartas = new ArrayList<>();
        cartas.add(new Carta(10, Figura.CORAZON));
        j.recibirCartas(cartas);
        
        Carta soltada = j.deshacerseDeCarta(0);
        assertNotNull(soltada);
        assertEquals("10 de CORAZON", soltada.toString());
    }

    /**
     * Valida que el método getInformacion genere una cadena válida 
     * que represente el estado actual del jugador.
     */
    @Test
    void testGetInformacion() {
        Jugador j = new Jugador("Test");
        assertNotNull(j.getInformacion());
    }
}
