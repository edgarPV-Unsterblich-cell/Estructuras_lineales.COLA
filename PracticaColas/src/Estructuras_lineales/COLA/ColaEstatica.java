package Estructuras_lineales.COLA;

public class ColaEstatica {
    private int[] arreglo;
    private int frente;
    private int fin;
    private int capacidad;

    public ColaEstatica(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new int[capacidad];
        this.frente = 0;
        this.fin = -1;
    }

    public boolean estaVacia() {
        return fin < frente;
    }

    public boolean estaLlena() {
        return fin == capacidad - 1;
    }

    public void encolar(int x) {
        if (estaLlena()) {
            System.out.println("La cola estática está llena");
            return;
        }
        arreglo[++fin] = x;
    }

    public int desencolar() {
        if (estaVacia()) {
            System.out.println("La cola estática está vacía");
            return -1;
        }
        return arreglo[frente++];
    }

    public int peek() {
        if (estaVacia()) {
            System.out.println("La cola estática está vacía");
            return -1;
        }
        return arreglo[frente];
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía");
            return;
        }
        System.out.print("Frente -> ");
        for (int i = frente; i <= fin; i++) {
            System.out.print("[" + arreglo[i] + "] ");
        }
        System.out.println("<- Fin");
    }
}