import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();  // Leemos el número ingresado

        // Verificar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Cerrar el scanner cuando ya no se necesite
        scanner.close(); // Aquí cerramos la instancia de Scanner
    }
}
