package Ejercicios;
import java.util.Locale;
import java.util.Scanner;
public class EjercicioSueldoConComisiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Esto hace que acepte el punto como separador decimal

        // Pedimos al usuario el sueldo base y el valor de las tres ventas
        System.out.print("Introduce el sueldo base del vendedor: ");
        double sueldoBase = sc.nextDouble();
        System.out.print("Introduce el valor de la primera venta (€): ");
        double venta1 = sc.nextDouble();
        System.out.print("Introduce el valor de la segunda venta (€): ");
        double venta2 = sc.nextDouble();
        System.out.print("Introduce el valor de la tercera venta (€): ");
        double venta3 = sc.nextDouble();

        final double COMISION = 0.1;

        // Calculamos el total de comisiones y el sueldo total
        double totalVentas = venta1 + venta2 + venta3;
        double totalComision = totalVentas * COMISION;
        double sueldoTotal = sueldoBase + totalComision;

        // Mostramos los resultados
        System.out.printf("💸 Comisión total: %.2f €", totalComision);
        System.out.println();
        System.out.printf("💼 Sueldo total del mes: %.2f €", sueldoTotal);

        sc.close();
    }
}
