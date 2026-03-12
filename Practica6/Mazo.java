
import java.util.ArrayList;
import java.util.Collections;
/**
 * Representa un mazo de 52 cartas.
 * Proporciona métodos para barajar, repartir y restablecer la baraja.
 */
public class Mazo {
    private ArrayList<Carta> cartas;

    /**
     * Constructor que crea el mazo y lo inicializa con 52 cartas.
     */
    public Mazo() {
        this.cartas = new ArrayList<>();
        restablecerMazo();
    }

    /**
     * Reinicia el mazo a su configuración original de 52 cartas.
     */
    public void restablecerMazo() {
        cartas.clear();
        for (Carta.Figura f : Carta.Figura.values()) {
            for (int i = 1; i <= 13; i++) {
                cartas.add(new Carta(i, f));
            }
        }
    }

    /**
     * Mezcla las cartas del mazo de forma aleatoria.
     */
    public void barajar() {
        Collections.shuffle(cartas);
    }

    /**
     * Extrae un número determinado de cartas del mazo.
     * @param numeroCartas Cantidad de cartas a repartir.
     * @return Lista de cartas extraídas.
     */
    public ArrayList<Carta> repartirCartas(int numeroCartas) {
        ArrayList<Carta> entregadas = new ArrayList<>();
        for (int i = 0; i < numeroCartas; i++) {
            if (!cartas.isEmpty()) {
                entregadas.add(cartas.remove(0));
            }
        }
        return entregadas;
    }

    /**
     * Agrega una carta individual al mazo (por ejemplo, una carta devuelta).
     * @param c La carta a agregar.
     */
    public void agregarCarta(Carta c) {
        cartas.add(c);
    }

    /**
     * Obtiene la cantidad actual de cartas en el mazo.
     * @return Número de cartas disponibles.
     */
    public int totalCartas() {
        return cartas.size();
    }
}
