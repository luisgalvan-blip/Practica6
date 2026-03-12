public class Main {
    public static void main(String[] args) {
        // Solo dejamos lo de la Práctica 6
        Carta miCarta = new Carta(10, Carta.Figura.CORAZON);
        Posicion pos = new Posicion(50, 50); // Prueba con coordenadas pequeñas para verla bien
        
        Visualizador.carta(miCarta, pos);
    }
}