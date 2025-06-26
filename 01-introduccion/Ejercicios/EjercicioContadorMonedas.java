package Ejercicios;
import java.util.Locale;
import java.util.Scanner;
public class EjercicioContadorMonedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Acepta decimales con punto

        // Pedimos al usuario la cantidad de cada tipo de moneda
        System.out.print("¿Cuántas monedas de 2€ tienes? ");
        int monedas2 = sc.nextInt();
        System.out.print("¿Cuántas monedas de 1€ tienes? ");
        int monedas1 = sc.nextInt();
        System.out.print("¿Cuántas monedas de 50 céntimos tienes? ");
        int monedas050 = sc.nextInt();
        System.out.print("¿Cuántas monedas de 20 céntimos tienes? ");
        int monedas020 = sc.nextInt();
        System.out.print("¿Cuántas monedas de 10 céntimos tienes? ");
        int monedas010 = sc.nextInt();

        // Calculamos el total de euros con monedas de 2€ y 1€
        int eurosTotales = (monedas2 * 2) + monedas1;

        // Calculamos el total de céntimos
        int centimosTotales = (monedas050 * 50) + (monedas020 * 20) + (monedas010 * 10);

        // Convertimos céntimos a euros si hay más de 100
        eurosTotales += centimosTotales / 100;
        centimosTotales = centimosTotales % 100;

        // Mostramos el resultado final
        System.out.println("💰 Tu dinero total es de " + eurosTotales + " euros y " + centimosTotales + " céntimos.");

        sc.close();
    }
}
