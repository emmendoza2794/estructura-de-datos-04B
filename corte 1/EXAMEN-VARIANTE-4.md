# Examen Parcial — Variante #4
<small>**Estudiante:** __________________________________________________________________ **Grupo:** ________ **Fecha:** __________</small>
<br><small>**Temas:** Scanner, Clases, Arreglos, Búsqueda (Lineal/Binaria) y Ordenamiento (Selección/Inserción).</small>

<table style="width: 100%; border-collapse: collapse; font-size: 0.85em;">
<tr>
<td style="width: 50%; vertical-align: top; border-right: 1px solid #ccc; padding-right: 15px;">

### Ejercicio 1: Cine (2.0 Puntos)
**Objetivo:** Gestionar precios de taquilla y buscar registros.

**¿Qué debes hacer?**
1. **Entrada:** Pide **5 precios** de boletas (double) y guárdalos en un arreglo.
2. **Ordenamiento:** Usa **Selección (Selection Sort)** para ordenar de mayor a menor.
3. **Búsqueda:** Pide un precio y búscalo con **Búsqueda Lineal**.
4. **Cálculo:** Muestra el promedio de los precios ingresados.

**Ejemplo de Consola:**
```text
Precio 1: 12000 | Precio 2: 15000...
--- PRECIOS (Descendente) ---
[18000.0, 15000.0, 12000.0...]
```
**Nota Ejercicio 1: ______ / 2.0**
</td>
<td style="width: 50%; vertical-align: top; padding-left: 15px;">

### Ejercicio 2: Estudiantes (3.0 Puntos)
**Objetivo:** Control de notas con POO y búsqueda por código.

**¿Qué debes hacer?**
1. **Clase:** `Estudiante` con `codigo` (int), `nombre` (String) y `nota` (double).
2. **Entrada:** Pide datos de **6 estudiantes** y guárdalos en `Estudiante[]`.
3. **Ordenamiento:** Usa **Inserción (Insertion Sort)** para ordenar por `codigo` (ascendente).
4. **Búsqueda:** Pide un `codigo` y búscalo con **Búsqueda Binaria**. Muestra el nombre y su nota.
5. **Aprobados:** Indica cuántos estudiantes aprobaron (nota >= 3.0).

**Ejemplo de Consola:**
```text
Cód: 205 | Nombre: Ana | Nota: 4.5
--- LISTADO ORDENADO POR CÓDIGO ---
101: Juan (3.2) | 205: Ana (4.5)...
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
public void solve(Problem p) {
    if (p.isComplex()) {
        p.divide();
        p.conquer();
    }
} // "Divide y vencerás: el secreto de los grandes algoritmos"
```
