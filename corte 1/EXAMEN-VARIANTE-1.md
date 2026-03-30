# Examen Parcial — Variante #1
<small>**Estudiante:** __________________________________________________________________ **Grupo:** ________ **Fecha:** __________</small>
<br><small>**Temas:** Scanner, Clases, Arreglos, Búsqueda (Lineal/Binaria) y Ordenamiento (Burbuja/Shell).</small>

<table style="width: 100%; border-collapse: collapse; font-size: 0.85em;">
<tr>
<td style="width: 50%; vertical-align: top; border-right: 1px solid #ccc; padding-right: 15px;">

### Ejercicio 1: Ventas (2.0 Puntos)
**Objetivo:** Gestionar ingresos, organizar y buscar montos.

**¿Qué debes hacer?**
1. **Entrada:** Pide **5 montos** (double) y guárdalos en un arreglo.
2. **Ordenamiento:** Usa **Burbuja (Bubble Sort)** para ordenar de menor a mayor.
3. **Búsqueda:** Pide un monto y búscalo con **Búsqueda Lineal**.
4. **Cálculo:** Muestra la suma total de las ventas.

**Ejemplo de Consola:**
```text
Venta 1: 150.50 | Venta 2: 80.00...
--- VENTAS ORDENADAS ---
[80.0, 150.5, 210.25...]
Total ventas: $760.75
```
**Nota Ejercicio 1: ______ / 2.0**
</td>
<td style="width: 50%; vertical-align: top; padding-left: 15px;">

### Ejercicio 2: Inventario (3.0 Puntos)
**Objetivo:** Administrar dispositivos con POO y búsqueda eficiente.

**¿Qué debes hacer?**
1. **Clase:** `Dispositivo` con `id` (int), `marca` (String) y `precio` (double).
2. **Entrada:** Pide datos de **6 dispositivos** y guárdalos en `Dispositivo[]`.
3. **Ordenamiento:** Usa **Shell Sort** para ordenar por `id` (menor a mayor).
4. **Búsqueda:** Pide un `id` y búscalo con **Búsqueda Binaria**. Muestra toda su info.
5. **Máximo:** Indica la marca y precio del dispositivo más costoso.

**Ejemplo de Consola:**
```text
ID: 502 | Marca: Samsung | $1200
--- ORDENADO POR ID (Shell) ---
ID: 101 | Apple | $1500
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
while(!success) { 
  code(); 
  learn(); 
  if(tired) coffee(); 
} // "La perseverancia es el algoritmo de la genialidad"
```
