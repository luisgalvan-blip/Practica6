
import java.util.ArrayList;

/**
 * Representa a un jugador con un nombre y una mano de cartas.
 */
public class Jugador {
    /** Nombre del jugador. Acceso público por requerimiento del problema. */
    public String nombre; 
    private ArrayList<Carta> mano;

    /**
     * Constructor para crear un jugador nuevo.
     * @param nombre Nombre inicial del jugador.
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    /**
     * Agrega una colección de cartas a la mano del jugador.
     * @param nuevas Lista de cartas a recibir.
     */
    public void recibirCartas(ArrayList<Carta> nuevas) {
        mano.addAll(nuevas);
    }

    /**
     * Remueve una carta de la mano según su posición.
     * @param indice Posición de la carta en la mano.
     * @return La carta removida, o null si el índice es inválido.
     */
    public Carta deshacerseDeCarta(int indice) {
        if (indice >= 0 && indice < mano.size()) {
            return mano.remove(indice);
        }
        return null;
    }

    /**
     * Genera una cadena con el nombre y las cartas actuales del jugador.
     * @return Información detallada del jugador.
     */
    public String getInformacion() {
        return "Jugador: " + nombre + " | Mano: " + mano.toString();
    }
}
