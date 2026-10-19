import Estructuras_lineales.COLA.ColaEstaticaCircular;
//By Edgar PV

public class MainColaCircular {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA ESTÁTICA CIRCULAR ===");

        // Se crea una cola circular pequeña para probar su capacidad
        ColaEstaticaCircular colaCircular = new ColaEstaticaCircular(3);

        // Llenamos la cola por completo
        colaCircular.encolar(100);
        colaCircular.encolar(200);
        colaCircular.encolar(300);

        colaCircular.mostrar();
        System.out.println("Elemento al frente (peek): " + colaCircular.peek());

        // Liberamos un espacio desencolando
        System.out.println("Desencolado: " + colaCircular.desencolar());

        // Agregamos un nuevo dato para demostrar que reutiliza las posiciones vacías
        colaCircular.encolar(400);

        colaCircular.mostrar();
        System.out.println("Elemento al frente (peek): " + colaCircular.peek());
    }
}