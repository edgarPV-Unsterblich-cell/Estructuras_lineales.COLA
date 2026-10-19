import Estructuras_lineales.COLA.ColaDinamica;
//By Edgar PV

public class MainColaDinamica {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA DINÁMICA ===");

        // Se crea la cola dinámica
        ColaDinamica colaDinamica = new ColaDinamica();

        // Encolamos varios valores
        colaDinamica.encolar(5);
        colaDinamica.encolar(15);
        colaDinamica.encolar(25);
        colaDinamica.encolar(35);

        // Desplegamos la cola y verificamos los métodos de análisis[cite: 2]
        colaDinamica.mostrar();
        System.out.println("Elemento al frente (peek): " + colaDinamica.peek());
        System.out.println("Total de elementos activos: " + colaDinamica.contarElementos());

        // Desencolamos un elemento y volvemos a contar
        System.out.println("Desencolado: " + colaDinamica.desencolar());
        colaDinamica.mostrar();
        System.out.println("Nuevo elemento al frente (peek): " + colaDinamica.peek());
        System.out.println("Total de elementos activos: " + colaDinamica.contarElementos());
    }
}