package Ejercicios;
import java.util.Locale;
import java.util.Scanner;
public class EjercicioRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Esto hace que acepte el punto como separador decimal

        // Pedimos al usuario que introduzca la altura y la anchura del rectángulo
        System.out.print("Introduce la altura del rectángulo: ");
        double altura = sc.nextDouble();
        System.out.print("Introduce la anchura del rectángulo: ");
        double anchura = sc.nextDouble();

        // Calculamos el área y el perímetro
        double area = altura * anchura;
        double perimetro = 2 * (altura + anchura);

        // Mostramos los resultados redondeados a 2 decimales
        System.out.printf("🧮 Área del círculo: %.2f", area);
        System.out.println();
        System.out.printf("📏 Perímetro del círculo: %.2f", perimetro);

        sc.close();
    }
}
