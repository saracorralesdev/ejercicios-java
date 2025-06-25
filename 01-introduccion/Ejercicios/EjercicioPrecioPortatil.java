package Ejercicios;
import java.util.Scanner;
/*
 * Calcula el precio final de un portátil a partir del coste de fabricación.
 * Añade un 30% de ganancia y un 21% de impuestos sobre el subtotal.
 * Muestra el precio total y si el portátil es NORMAL (≤600 €) o DE LUJO (>600 €).
 */
public class EjercicioPrecioPortatil {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitamos al usuario que introduzca el coste de fabricación
        System.out.print("Introduce el coste de fabricación del portátil: ");
        double costeFabricacion = sc.nextDouble();

        // Constantes para el cálculo: 30% de ganancia y 21% de impuestos
        final double COSTE_GANANCIA = 0.30;
        final double IMPUESTOS = 0.21;

        // Calculamos subtotal con ganancia incluida
        double subTotal = costeFabricacion + (costeFabricacion * COSTE_GANANCIA);

        // Calculamos el precio total sumando impuestos
        double precioTotal = subTotal + (subTotal * IMPUESTOS);

        // Mostramos el precio final
        System.out.println("Precio final del portátil: " + precioTotal + " €.");

        // Clasificamos el portátil como NORMAL o DE LUJO
        String mensajeFinal = (precioTotal <= 600) ? "✅ El portátil es de precio NORMAL." : "💎 El portátil es de precio DE LUJO.";
        System.out.println(mensajeFinal);

        sc.close();
    }
}
