package Ejercicios;
import java.util.Locale;
import java.util.Scanner;
public class EjercicioNotaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Esto hace que acepte el punto como separador decimal

        // Pedimos al usuario que introduzca las tres notas
        System.out.print("Introduce la nota del primer trimestre: ");
        double nota1 = sc.nextDouble();
        System.out.print("Introduce la nota del segundo trimestre: ");
        double nota2 = sc.nextDouble();
        System.out.print("Introduce la nota del tercer trimestre: ");
        double nota3 = sc.nextDouble();

        // Calculamos la media de las tres notas
        double notaMedia = (nota1 + nota2 + nota3) / 3;
        // Redondeamos a dos decimales
        notaMedia = Math.round(notaMedia * 100.0) / 100.0;
        // Mostramos la nota media redondeada
        System.out.printf("📊 Nota media final: %.2f", notaMedia);
        System.out.println();

        // Mostramos un mensaje personalizado según si aprueba o suspende
        String resultadoFinal = (notaMedia >= 5) ? "✅ ¡Enhorabuena, has aprobado!" : "❌ Lo siento, has suspendido.";
        System.out.println(resultadoFinal);

        sc.close();
    }
}
