# Examen Parcial — Variante #6
<small>**Estudiante:** __________________________________________________________________ **Grupo:** ________ **Fecha:** __________</small>
<br><small>**Temas:** Scanner, Clases, Arreglos, Búsqueda (Lineal/Binaria) y Ordenamiento (Burbuja/Inserción).</small>

<table style="width: 100%; border-collapse: collapse; font-size: 0.85em;">
<tr>
<td style="width: 50%; vertical-align: top; border-right: 1px solid #ccc; padding-right: 15px;">

### Ejercicio 1: Gimnasio (2.0 Puntos)
**Objetivo:** Controlar pesos de entrenamiento y buscar récords.

**¿Qué debes hacer?**
1. **Entrada:** Pide **7 pesos** levantados (int) y guárdalos en un arreglo.
2. **Ordenamiento:** Usa **Burbuja (Bubble Sort)** para ordenar de mayor a menor.
3. **Búsqueda:** Pide un peso y búscalo con **Búsqueda Lineal**.
4. **Cálculo:** Muestra cuál fue el peso máximo levantado.

**Ejemplo de Consola:**
```text
Peso 1: 40 | Peso 2: 55...
--- PESOS (Descendente) ---
[80, 75, 55, 40...]
```
**Nota Ejercicio 1: ______ / 2.0**
</td>
<td style="width: 50%; vertical-align: top; padding-left: 15px;">

### Ejercicio 2: Ecommerce (3.0 Puntos)
**Objetivo:** Administrar productos con POO y búsqueda eficiente.

**¿Qué debes hacer?**
1. **Clase:** `Producto` con `sku` (int), `nombre` (String) y `stock` (int).
2. **Entrada:** Pide datos de **5 productos** y guárdalos en `Producto[]`.
3. **Ordenamiento:** Usa **Inserción (Insertion Sort)** para ordenar por `sku` (ascendente).
4. **Búsqueda:** Pide un `sku` y búscalo con **Búsqueda Binaria**. Muestra el nombre y su stock.
5. **Inventario:** Calcula la suma total de todas las unidades en stock.

**Ejemplo de Consola:**
```text
SKU: 304 | Nombre: Teclado | Stock: 15
--- PRODUCTOS POR SKU ---
SKU 101: Monitor | SKU 304: Teclado...
```
**Nota Ejercicio 2: ______ / 3.0**
</td>
</tr>
</table>

---
<small>
<b>Instrucciones:</b> 1. Use <code>Scanner</code>. 2. Muestre el arreglo antes/después de ordenar. 3. Comente su código.
<br><b>ADVERTENCIA:</b> Estudiante detectado hablando, consultando internet o usando IA tendrá un "bono extra" de <b>-0.5</b> en la nota definitiva.
</small>

```java
try {
    solveProblem();
} catch (Exception e) {
    analyze();
    retry();
} // "Tu código no define quién eres, pero tu capacidad de debuggear sí."
```
