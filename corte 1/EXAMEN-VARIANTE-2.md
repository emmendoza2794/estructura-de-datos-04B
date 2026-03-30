# Examen Parcial — Variante #2
<small>**Estudiante:** __________________________________________________________________ **Grupo:** ________ **Fecha:** __________</small>
<br><small>**Temas:** Scanner, Clases, Arreglos, Búsqueda (Lineal/Binaria) y Ordenamiento (Selección/Inserción).</small>

<table style="width: 100%; border-collapse: collapse; font-size: 0.85em;">
<tr>
<td style="width: 50%; vertical-align: top; border-right: 1px solid #ccc; padding-right: 15px;">

### Ejercicio 1: Clima (2.0 Puntos)
**Objetivo:** Analizar temperaturas semanales y buscar registros.

**¿Qué debes hacer?**
1. **Entrada:** Pide **7 temperaturas** (double) y guárdalas en un arreglo.
2. **Ordenamiento:** Usa **Selección (Selection Sort)** para ordenar de mayor a menor.
3. **Búsqueda:** Pide una temperatura y búscala con **Búsqueda Lineal**.
4. **Cálculo:** Muestra el promedio de temperatura de la semana.

**Ejemplo de Consola:**
```text
Día 1: 22.5 | Día 2: 30.1...
--- TEMPERATURAS (Descendente) ---
[30.1, 28.5, 22.5, 18.0...]
```
**Nota Ejercicio 1: ______ / 2.0**
</td>
<td style="width: 50%; vertical-align: top; padding-left: 15px;">

### Ejercicio 2: Biblioteca (3.0 Puntos)
**Objetivo:** Gestionar libros con POO y búsqueda rápida.

**¿Qué debes hacer?**
1. **Clase:** `Libro` con `codigo` (int), `titulo` (String) y `paginas` (int).
2. **Entrada:** Pide datos de **5 libros** y guárdalos en `Libro[]`.
3. **Ordenamiento:** Usa **Inserción (Insertion Sort)** para ordenar por `codigo` (ascendente).
4. **Búsqueda:** Pide un `codigo` y búscalo con **Búsqueda Binaria**. Muestra su título.
5. **Mínimo:** Indica el título del libro con menos páginas.

**Ejemplo de Consola:**
```text
Cód: 105 | Título: Java | Págs: 300
--- BIBLIOTECA ORDENADA ---
101: SQL | 105: Java...
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
if (Logic.isBroken() || Code.hasBugs()) {
    keepCalm();
    debug(self);
} // "Tu única competencia es el código que escribiste ayer"
```
