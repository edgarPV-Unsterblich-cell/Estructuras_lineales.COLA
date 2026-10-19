# Práctica de Estructuras Lineales: Implementación de Colas en Java
By:Edgar

Este repositorio contiene la implementación modular de diferentes tipos de Colas (Estática, Estática Circular y Dinámica) desarrolladas en Java bajo el paquete `Estructuras_lineales.COLA`.

## 📁 Estructura del Proyecto

El proyecto está diseñado de forma modular, contando con un punto de entrada `Main` independiente por cada tipo de estructura implementada:

```text
src/
├── Estructuras_lineales/
│   ├── Nodo.java                       # Clase auxilar de nodo enlazado
│   └── COLA/
│       ├── ColaEstatica.java           # Cola basada en arreglo fijo
│       ├── ColaEstaticaCircular.java   # Cola circular basada en arreglo reutilizable
│       └── ColaDinamica.java           # Cola dinámica basada en nodos enlazados
├── MainColaEstatica.java               # Prueba independiente de Cola Estática
├── MainColaCircular.java               # Prueba independiente de Cola Circular
└── MainColaDinamica.java               # Prueba independiente de Cola Dinámica
```

---

## 🛠️ Clases y Métodos Destacados

### 1. Cola Estática Lineal (`ColaEstatica.java`)
- `encolar(int x)`: Inserta un dato al final del arreglo.
- `desencolar()`: Extrae el elemento del frente.
- `peek()`: Consulta el valor en el frente sin modificar apuntadores.

### 2. Cola Estática Circular (`ColaEstaticaCircular.java`)
- Utiliza la operación de módulo (`%`) para reutilizar posiciones liberadas en el arreglo.
- `peek()`: Valida si la cola contiene elementos y retorna el dato en `frente` sin alterar punteros.

### 3. Cola Dinámica (`ColaDinamica.java`)
- Implementación mediante nodos enlazados (`Nodo.java`).
- `peek()`: Consulta el valor del nodo en el frente sin desvincularlo.
- `contarElementos()`: Realiza un recorrido lineal sobre los nodos para retornar el total de elementos activos.

---

## 🚀 Ejecución de las Variantes (`Main`)

Cada variante de cola cuenta con su propia clase ejecutable e independiente:

1. **Prueba de Cola Estática:**
   Ejecutar la clase `MainColaEstatica.java` para verificar inserción, extracción y consulta `peek()`.

2. **Prueba de Cola Circular:**
   Ejecutar la clase `MainColaCircular.java` para comprobar el comportamiento circular y el reuso de índices en el arreglo.

3. **Prueba de Cola Dinámica:**
   Ejecutar la clase `MainColaDinamica.java` para probar la asignación dinámica de memoria y el recorrido de conteo de nodos.
