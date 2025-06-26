package Ejercicios;
import java.util.Scanner;
public class EjercicioParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario un número entero
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        // Comprobamos si es par o impar usando el operador ternario
        String resultado = (numero % 2 == 0) ? "✅ Es un número par." : "❌ Es un número impar.";

        // Mostramos el resultado
        System.out.println(resultado);

        sc.close();
    }
}
