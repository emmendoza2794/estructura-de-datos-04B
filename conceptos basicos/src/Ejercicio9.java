public class Ejercicio9 {

  public static void main(String[] args) {
    // Ejercicio 9: Uso de la clase String y sus métodos

    String texto = "Hola, Mundo!";
    System.out.println("Texto original: " + texto);

    // Convertir a mayúsculas
    String mayusculas = texto.toUpperCase();
    System.out.println("En mayúsculas: " + mayusculas);

    // Convertir a minúsculas
    String minusculas = texto.toLowerCase();
    System.out.println("En minúsculas: " + minusculas);

    // Obtener la longitud del texto
    int longitud = texto.length();
    System.out.println("Longitud del texto: " + longitud);

    // Reemplazar una palabra
    String reemplazado = texto.replace("Mundo", "Java");
    System.out.println("Texto reemplazado: " + reemplazado);

    // Subcadena
    String subcadena = texto.substring(7, 12);
    System.out.println("Subcadena (7-12): " + subcadena);
  }
  
}
