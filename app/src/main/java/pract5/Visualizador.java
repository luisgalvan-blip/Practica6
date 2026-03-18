package pract5;

/**
 * Clase para visualizar cartas usando el código base del profesor.
 */
public class Visualizador {

    public static void carta(Carta c, Posicion p) {
        // 1. Cuerpo de la carta (Fondo)
        Square cuerpo = new Square();
        cuerpo.changeSize(80);
        
        // El Square del profesor inicia en 310, 120. 
        // Para moverlo a p.getX(), p.getY():
        cuerpo.moveHorizontal(p.getX() - 310);
        cuerpo.moveVertical(p.getY() - 120);
        
        // Color según el tipo de carta
        if (c.toString().contains("CORAZON") || c.toString().contains("DIAMANTE")) {
            cuerpo.changeColor("red");
        } else {
            cuerpo.changeColor("black");
        }
        cuerpo.makeVisible();

        // 2. El "Palo" de la carta (un círculo blanco en el centro)
        Circle palo = new Circle();
        palo.changeSize(30);
        palo.changeColor("white");
        
        // El Circle inicia en 230, 90. Lo centramos en el Square:
        palo.moveHorizontal(p.getX() - 230 + 25);
        palo.moveVertical(p.getY() - 90 + 25);
        palo.makeVisible();

        System.out.println("Mostrando en pantalla: " + c.toString());
    }
}