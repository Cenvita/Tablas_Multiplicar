import java.util.Scanner; // Importa la clase Scanner necesaria para obtener la entrada del usuario

public class TablasDeMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para obtener la entrada del usuario

        System.out.println("Introduce un número: "); // Solicita al usuario que introduzca un número
        int num = scanner.nextInt(); // Guarda el número introducido por el usuario

        // Bucle externo: itera a través de cada número desde 1 hasta 'num'
        for (int j = 1; j <= num; j++) {
            System.out.println("La tabla del " + j + " es:"); // Imprime la cabecera de la tabla actual

            // Bucle interno: itera a través de los números del 1 al 10 para multiplicar por 'j'
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + j + " = " + (i * j)); // Imprime cada línea de la tabla de multiplicar
            }

            System.out.println("----------"); // Imprime un separador antes de pasar a la siguiente tabla
        }

        scanner.close(); // Cierra el objeto Scanner para liberar sus recursos
    }
}
