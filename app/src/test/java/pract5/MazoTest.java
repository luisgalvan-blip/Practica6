package pract5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pract5.Carta.Figura;
import java.util.ArrayList;

/**
 * Clase de prueba para la gestión del Mazo de cartas.
 * Verifica la inicialización, el barajado y el reparto de cartas.
 * @author Luis Galvan
 * @see Mazo
 */
public class MazoTest {

    /**
     * Prueba que al crear un mazo nuevo, este contenga las 52 cartas reglamentarias.
     */
    @Test
    void testTotalCartas() {
        Mazo mazo = new Mazo();
        assertEquals(52, mazo.totalCartas());
    }

    /**
     * Verifica que el reparto de cartas funcione correctamente: 
     * entregando la cantidad solicitada y restándolas del mazo original.
     */
    @Test
    void testRepartirCartas() {
        Mazo mazo = new Mazo();
        ArrayList<Carta> mano = mazo.repartirCartas(5);
        assertEquals(5, mano.size());
        assertEquals(47, mazo.totalCartas());
    }

    /**
     * Prueba la funcionalidad de agregar una carta individual de vuelta al mazo.
     */
    @Test
    void testAgregarCarta() {
        Mazo mazo = new Mazo();
        Carta c = new Carta(5, Figura.TREBOL);
        mazo.agregarCarta(c);
        assertEquals(53, mazo.totalCartas());
    }

    /**
     * Valida que el mazo pueda reiniciarse a su estado original de 52 cartas 
     * sin importar cuántas cartas se hayan repartido previamente.
     */
    @Test
    void testRestablecerMazo() {
        Mazo mazo = new Mazo();
        mazo.repartirCartas(10);
        mazo.restablecerMazo();
        assertEquals(52, mazo.totalCartas());
    }

    /**
     * Asegura que el proceso de barajado se ejecute sin errores técnicos.
     */
    @Test
    void testBarajar() {
        Mazo mazo = new Mazo();
        assertDoesNotThrow(() -> mazo.barajar());
    }
}
