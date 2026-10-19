import Estructuras_lineales.COLA.ColaEstatica;
//By Edgar PV

public class MainColaEstatica {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA ESTÁTICA ===");

        // Se instancia una cola estática con capacidad para 5 elementos
        ColaEstatica cola = new ColaEstatica(5);

        // Agregamos elementos a la cola
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        // Mostramos el contenido de la cola
        cola.mostrar();

        // Probamos el método peek() para ver el primer elemento
        System.out.println("Elemento al frente (peek): " + cola.peek());

        // Sacamos un elemento de la cola
        System.out.println("Desencolado: " + cola.desencolar());

        // Mostramos el estado final de la cola
        cola.mostrar();
        System.out.println("Nuevo elemento al frente (peek): " + cola.peek());
    }
}