package Ejercicios;
import java.util.Locale;
import java.util.Scanner;
public class EjercicioCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Esto hace que acepte el punto como separador decimal

        // Pedimos al usuario que introduzca el radio del círculo
        System.out.print("Introduce el radio del círculo: ");
        double radio = sc.nextDouble();

        // Calculamos el área y el perímetro
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        // Mostramos los resultados redondeados a 2 decimales
        System.out.printf("🧮 Área del círculo: %.2f", area);
        System.out.println();
        System.out.printf("📏 Perímetro del círculo: %.2f", perimetro);

        sc.close();
    }
}
