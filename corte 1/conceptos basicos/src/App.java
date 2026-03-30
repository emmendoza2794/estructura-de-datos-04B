import java.util.Scanner;

/**
 * Menú principal — Conceptos Básicos de Java
 * Permite ejecutar cada ejercicio desde un único punto de entrada.
 */
public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n==============================================");
            System.out.println("   CONCEPTOS BÁSICOS DE JAVA — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  E1 — Variables y Tipos de Datos");
            System.out.println("    [1] Demostración estática");
            System.out.println("    [2] Interactivo (ingresa tus datos)");
            System.out.println();
            System.out.println("  E2 — Variables por Referencia");
            System.out.println("    [3] Demostración estática");
            System.out.println("    [4] Interactivo");
            System.out.println();
            System.out.println("  E3 — Estructuras Lineales y No Lineales");
            System.out.println("    [5] Demostración estática");
            System.out.println("    [6] Interactivo");
            System.out.println();
            System.out.println("  E4 — Programación Orientada a Objetos (POO)");
            System.out.println("    [7] Demostración estática");
            System.out.println("    [8] Interactivo");
            System.out.println("    [9] Ejercicio 9");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");


            opcion = sc.nextInt();

            System.out.println();

            switch (opcion) {
                case 1:
                    E1Variables.main(new String[]{});
                    break;
                case 2:
                    E1VariablesInput.main(new String[]{});
                    break;
                case 3:
                    E2VariablesPorReferencia.main(new String[]{});
                    break;
                case 4:
                    E2VariablesPorReferenciaInput.main(new String[]{});
                    break;
                case 5:
                    E3EstructurasLinealesNoLineales.main(new String[]{});
                    break;
                case 6:
                    E3EstructurasInput.main(new String[]{});
                    break;
                case 7:
                    E4POO.main(new String[]{});
                    break;
                case 8:
                    E4POOInput.main(new String[]{});
                    break;
                case 9:
                    Ejercicio9.main(new String[]{});
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
