package Ejercicios;
import java.util.Scanner;
public class EjercicioComparacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario dos números enteros
        System.out.print("Introduce el primer número: ");
        int numero1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = sc.nextInt();

        // Comparamos los números y mostramos el resultado
        if (numero1 > numero2) {
            System.out.println("✅ El primer número es mayor que el segundo.");
        } else if (numero1 < numero2) {
            System.out.println("✅ El segundo número es mayor que el primero.");
        } else {
            System.out.println("✅ Ambos números son iguales.");
        }

        sc.close();
    }
}
