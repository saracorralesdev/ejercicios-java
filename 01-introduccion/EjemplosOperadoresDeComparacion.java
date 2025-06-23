// Clase para mostrar ejemplos de operadores de comparación en Java
public class EjemplosOperadoresDeComparacion {
    public static void main(String[] args) {

        // Operadores que devuelven un resultado booleano (verdadero, falso)
        System.out.println("----- Operadores De Comparación -----");

        int a = 5;
        int b = 8;

        // Igualdad
        System.out.println("¿a == b? → " + (a == b)); // false

        // Diferente
        System.out.println("¿a != b? → " + (a != b)); // true

        // Mayor que
        System.out.println("¿a > b? → " + (a > b)); // false

        // Menor que
        System.out.println("¿a < b? → " + (a < b)); // true

        // Mayor o igual que
        System.out.println("¿a >= b? → " + (a >= b)); // false

        // Menor o igual que
        System.out.println("¿a <= b? → " + (a <= b)); // true
    }
}