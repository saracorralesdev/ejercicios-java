package Ejercicios;
import java.util.Scanner;
public class EjercicioCalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario dos números enteros
        System.out.print("Introduce el primer número: ");
        int numero1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = sc.nextInt();

        // Realizamos las operaciones
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;

        // Mostramos los resultados
        System.out.println("➕ Suma: " + suma);
        System.out.println("➖ Resta: " + resta);
        System.out.println("✖️ Multiplicación: " + multiplicacion);

        // División y módulo con control de división por cero
        if (numero2 != 0) {
            int division = numero1 / numero2;
            int resto = numero1 % numero2;
            System.out.println("➗ División: " + division);
            System.out.println("🔁 Resto: " + resto);
        } else {
            System.out.println("❌ No se puede dividir entre cero.");
        }

        sc.close();
    }
}
