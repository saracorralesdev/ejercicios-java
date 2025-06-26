package Ejercicios;
import java.util.Locale;
import java.util.Scanner;
public class EjercicioConversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Acepta decimales con punto

        // Pedimos al usuario que introduzca la cantidad en €
        System.out.print("Introduce la cantidad en euros (€): ");
        double euros = sc.nextDouble();

        // 1 euro = 1.17 dólares
        final double DOLAR = 1.17;

        // Calculamos el total en dólares
        double totalDolares = euros * DOLAR;

        // Mostramos el resultado redondeado a 2 decimales
        System.out.printf("💵 Equivalente en dólares: %.2f $", totalDolares);

        sc.close();
    }
}
