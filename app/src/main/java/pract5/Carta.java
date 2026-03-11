package pract5;

/**
 * Representa una carta individual de la baraja.
 * Contiene un valor numérico y una figura (palo).
 * * @author Luis Galvan
 * @version 1.0
 */
public class Carta {
    private int valor;
    private Figura tipo;

    /**
     * Constructor para inicializar una carta con su valor y tipo.
     * @param valor Valor numérico de la carta (1 al 13).
     * @param f Figura de la baraja (TREBOL, DIAMANTE, PICA, CORAZON).
     */
    public Carta(int valor, Figura f){
        this.valor = valor;
        this.tipo = f;
    }

    /**
     * Devuelve una representación en texto de la carta.
     * Convierte valores especiales (1, 11, 12, 13) en letras (A, J, Q, K).
     * @return Cadena con el formato "Valor de FIGURA".
     */
    @Override
    public String toString(){
        String nombreValor;
        switch(valor){
            case 1: nombreValor = "A"; break;
            case 11: nombreValor = "J"; break;
            case 12: nombreValor = "Q"; break;
            case 13: nombreValor = "K"; break;
            default: nombreValor = String.valueOf(valor);
        }
        return nombreValor + " de " + tipo;
    }

    /**
     * Enumeración de las figuras posibles en la baraja.
     */
    public enum Figura{
        TREBOL, DIAMANTE, PICA, CORAZON
    }
}
