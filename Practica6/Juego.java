
/**
 * Clase principal que ejecuta la simulación del juego.
 */
public class Juego {
    public static void main(String[] args) {
        // --- INICIALIZACIÓN ---
        Mazo mazoOficial = new Mazo();
        System.out.println("CREANDO MAZO DE 52 CARTAS");
        System.out.println("Mazo creado con " + mazoOficial.totalCartas() + " cartas.");

        // --- BARAJADO ---
        System.out.println("\nBARAJANDO MAZO...");
        mazoOficial.barajar();
        System.out.println("¡Mazo barajado!");

        // --- CREACIÓN DE JUGADORES ---
        System.out.println("\nCREANDO 3 JUGADORES");
        Jugador j1 = new Jugador("Luis");
        Jugador j2 = new Jugador("Luisa");
        Jugador j3 = new Jugador("Nomar");
        System.out.println("Jugador 1: " + j1.nombre);
        System.out.println("Jugador 2: " + j2.nombre);
        System.out.println("Jugador 3: " + j3.nombre);

        // --- REPARTO ---
        System.out.println("\nREPARTIENDO 5 CARTAS A CADA JUGADOR");
        j1.recibirCartas(mazoOficial.repartirCartas(5));
        j2.recibirCartas(mazoOficial.repartirCartas(5));
        j3.recibirCartas(mazoOficial.repartirCartas(5));
        System.out.println("Repartiendo... ¡Listo!");

        // --- MOSTRAR ESTADO ---
        System.out.println("\nMOSTRANDO CARTAS DE CADA JUGADOR:");
        System.out.println(j1.getInformacion());
        System.out.println(j2.getInformacion());
        System.out.println(j3.getInformacion());
        
        System.out.println("\nCARTAS RESTANTES EN EL MAZO (DESPUÉS DE REPARTIR):");
        System.out.println("Quedan " + mazoOficial.totalCartas() + " cartas en el mazo.");

        // --- GESTIÓN (DEVOLVER CARTA) ---
        System.out.println("\nGESTIÓN DEL MAZO");
        Carta devuelta = j1.deshacerseDeCarta(0); 
        
        if (devuelta != null) {
            System.out.println(j1.nombre + " DEVUELVE 1 CARTA AL MAZO (" + devuelta + ")");
            mazoOficial.agregarCarta(devuelta);
        }

        // --- RESUMEN FINAL ---
        System.out.println("\nRESUMEN FINAL");
        System.out.println("Total de cartas en el mazo: " + mazoOficial.totalCartas());
        System.out.println(j1.getInformacion());
        System.out.println("\nEl programa ha finalizado con éxito.");
    }
}