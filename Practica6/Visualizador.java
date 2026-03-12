public class Visualizador {

    public static void carta(Carta c, Posicion p) {
        // 1. Dibujar fondo
        Square fondo = new Square();
        fondo.changeSize(140); 
        fondo.changeColor("white");
        fondo.makeVisible();
        
        fondo.moveHorizontal(p.getX() - 60); 
        fondo.moveVertical(p.getY() - 50);

        // 2. Color
        String color = (c.getFigura() == Carta.Figura.CORAZON || 
                        c.getFigura() == Carta.Figura.DIAMANTE) ? "red" : "black";

        // 3. Dibujar los puntos
        int[][] pos10 = {
            {20, 20}, {100, 20},  // Arriba
            {20, 50}, {100, 50},  // Medio-Arriba
            {20, 80}, {100, 80},  // Medio-Abajo
            {20, 110}, {100, 110},// Abajo
            {60, 35}, {60, 95}    // Los dos centrales
        };

        for (int i = 0; i < c.getValor() && i < pos10.length; i++) {
            dibujarPunto(p.getX() + pos10[i][0], p.getY() + pos10[i][1], color);
        }
    }

    private static void dibujarPunto(int x, int y, String color) {
        Circle punto = new Circle();
        punto.changeSize(15);
        punto.changeColor(color);
        punto.makeVisible();
        
        punto.moveHorizontal(x - 20); 
        punto.moveVertical(y - 60);
    }
}