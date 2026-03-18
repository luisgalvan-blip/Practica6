package pract5;

/**
 * Clase principal para ejecutar la demostración de la práctica 6.
 */
public class Main {
    public static void main(String[] args) {
        // 1. Configurar el Canvas
        Canvas canvas = Canvas.getCanvas();
        canvas.setVisible(true);

        // 2. Crear objetos necesarios
        // Usamos Carta.Figura.CORAZON porque es un Enum interno
        Carta miCarta = new Carta(1, Carta.Figura.CORAZON); 
        Posicion miPos = new Posicion(150, 150);

        // 3. Ejecutar visualización
        Visualizador.carta(miCarta, miPos);
    }
}
