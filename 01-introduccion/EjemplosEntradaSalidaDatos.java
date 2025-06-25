import java.util.Locale;
import java.util.Scanner;
public class EjemplosEntradaSalidaDatos {
    public static void main(String[] args) {

        // Crear el objeto Scanner y establecer el Locale para usar el punto como separador decimal
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // Entrada de base y altura para calcular el área de un rectángulo
        System.out.print("Introduce la base del rectángulo: ");
        double base = sc.nextDouble();

        System.out.print("Introduce la altura del rectángulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        // Mostrar el resultado con distintos formatos
        System.out.println("El área del rectángulo es: " + area);
        System.out.printf("El área (formateada con 2 decimales) es: %.2f", area);

        // Cerrar el scanner
        sc.close();
    }
}
