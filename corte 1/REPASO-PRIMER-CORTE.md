# Repaso para el Parcial — Primer Corte (Final)
> **Temas:** Scanner (Ingreso por teclado), Clases, Arrays, Búsqueda y Ordenamiento.

Este documento contiene 3 ejercicios diseñados para practicar la lógica de programación y algoritmos. **Nota:** Toda la información debe ser ingresada por el usuario usando la clase `Scanner`.

---

## Ejercicio 1: Inventario "TecnoStore" (Shell Sort)
**Objetivo:** Registrar productos y ordenarlos por su ID para realizar búsquedas rápidas.

### ¿Qué debes hacer?
1.  **Clase:** Crea una clase `Producto` con: `id` (int), `nombre` (String), `precio` (double) y `stock` (int).
2.  **Entrada de Datos:** Pide al usuario que ingrese los datos de **5 productos** por teclado y guárdalos en un arreglo `Producto[]`.
3.  **Ordenamiento:** Usa **Shell Sort** para ordenar los productos de menor a mayor según su `id`.
4.  **Búsqueda:** Pide un `id` al usuario y búscalo usando **Búsqueda Binaria**.

### Ejemplo de lo que se debe ver en consola:
```text
--- REGISTRO DE PRODUCTOS ---
Producto 1:
Ingrese ID: 105
Ingrese Nombre: Mouse
Ingrese Precio: 25.50
Ingrese Stock: 10

... (se repite hasta completar los 5 productos) ...

--- INVENTARIO ORDENADO POR ID (Shell Sort) ---
ID: 101 | Nombre: Laptop | Precio: 850.0 | Stock: 5
ID: 102 | Nombre: Teclado | Precio: 45.0  | Stock: 12
ID: 105 | Nombre: Mouse   | Precio: 25.5  | Stock: 10
...

--- BÚSQUEDA DE PRODUCTO ---
Ingrese el ID a buscar: 102
>> PRODUCTO ENCONTRADO: Teclado - Precio: $45.0 - Stock: 12
```

---

## Ejercicio 2: Competencia de Atletismo (Inserción)
**Objetivo:** Ingresar puntajes y organizarlos de mayor a menor para determinar el podio.

### ¿Qué debes hacer?
1.  **Entrada:** Pide al usuario que ingrese **6 puntajes** (números enteros) por teclado.
2.  **Ordenamiento:** Usa **Inserción (Insertion Sort)** para ordenar los puntajes de **mayor a menor**.
3.  **Búsqueda:** Pide un puntaje al usuario y búscalo usando **Búsqueda Lineal**. Indica en qué posición (lugar) de la tabla quedó.

### Ejemplo de lo que se debe ver en consola:
```text
--- INGRESO DE PUNTAJES ---
Puntaje del Intento 1: 85
Puntaje del Intento 2: 98
Puntaje del Intento 3: 70
... (hasta llegar a 6) ...

--- TABLA DE RESULTADOS (De mayor a menor) ---
1° Lugar: 98
2° Lugar: 85
3° Lugar: 70
...

El promedio total de los puntajes fue: 84.3

--- BÚSQUEDA LINEAL ---
Ingrese puntaje a buscar: 85
>> El puntaje 85 se encuentra en el 2° lugar de la tabla.
```

---

## Ejercicio 3: Control de Notas (Selección)
**Objetivo:** Gestionar las notas de un grupo, encontrar los valores extremos y ordenar la lista.

### ¿Qué debes hacer?
1.  **Entrada:** Pide al usuario **5 notas** (números decimales) por teclado.
2.  **Estadísticas:** Recorre el arreglo para encontrar cuál es la nota más alta y cuál la más baja del grupo.
3.  **Ordenamiento:** Ordena las notas de menor a mayor usando **Selección (Selection Sort)**.

### Ejemplo de lo que se debe ver en consola:
```text
--- REGISTRO DE NOTAS ---
Ingrese nota del Estudiante 1: 3.5
Ingrese nota del Estudiante 2: 4.8
Ingrese nota del Estudiante 3: 2.0
... (hasta completar las 5) ...

--- INFORME ACADÉMICO ---
La nota más ALTA del grupo es: 4.8
La nota más BAJA del grupo es: 2.0

--- LISTA DE NOTAS ORDENADA (Menor a Mayor) ---
[2.0, 3.0, 3.5, 4.2, 4.8]
```

---
**Instrucciones finales para el estudiante:**
- Usa `Scanner leer = new Scanner(System.in);` para todas las lecturas de datos.
- Asegúrate de imprimir el arreglo **antes** y **después** de aplicar los algoritmos de ordenamiento para ver el cambio.
- Para la **Búsqueda Binaria** (Ejercicio 1), recuerda que el arreglo DEBE estar ordenado por ID previamente.
