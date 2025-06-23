// Clase para mostrar ejemplos de operadores aritméticos básicos en Java
public class EjemplosOperadoresAritmeticos {
    public static void main(String[] args) {

        System.out.println("----- Operadores Aritméticos Básicos -----");

        int numero1 = 10;
        int numero2 = 3;

        // Suma
        int suma = numero1 + numero2;
        System.out.println("Suma (" + numero1 + " + " + numero2 + ") = " + suma);

        // Resta
        int resta = numero1 - numero2;
        System.out.println("Resta (" + numero1 + " - " + numero2 + ") = " + resta);

        // Multiplicación
        int multiplicacion = numero1 * numero2;
        System.out.println("Multiplicación (" + numero1 + " * " + numero2 + ") = " + multiplicacion);

        // División entera
        int divisionEntera = numero1 / numero2;
        System.out.println("División entera (" + numero1 + " / " + numero2 + ") = " + divisionEntera);

        // División decimal
        double divisionDecimal = (double) numero1 / numero2;
        System.out.println("División decimal (" + numero1 + " / " + numero2 + ") = " + divisionDecimal);

        // Módulo o resto de una división
        int resto = numero1 % numero2;
        System.out.println("Módulo o resto (" + numero1 + " % " + numero2 + ") = " + resto);

        System.out.println();
        System.out.println("----- Operadores Aritméticos De Asignación -----");

        int a = 7;
        a += 1; // equivale a a = a + 1
        System.out.println("a += 1 → " + a); // 8

        int b = 9;
        b -= 1; // equivale a b = b - 1
        System.out.println("b -= 1 → " + b); // 8

        int c = 3;
        c *= 2; // equivale a c = c * 2
        System.out.println("c *= 2 → " + c); // 6

        int d = 10;
        d %= 3; // equivale a d = d % 3
        System.out.println("d %= 3 → " + d); // 1

        System.out.println();
        System.out.println("----- Operadores Aritméticos Unarios -----");

        int e = 8;
        int eNegativo = -e; // cambia el signo
        System.out.println("-e → " + eNegativo); // -8

        int inc = 8;
        inc++; // post-incremento: suma 1
        System.out.println("inc++ → " + inc); // 9

        // Pre-incremento: suma 1 y luego asigna
        inc = 8;
        int preIncremento = ++inc;
        System.out.println("++inc → " + preIncremento); // 9

        // Post-incremento: asigna y luego suma 1
        inc = 8;
        int postIncremento = inc++;
        System.out.println("inc++ → " + postIncremento); // 8

        System.out.println();
        System.out.println("----- Procedencia De Operadores -----");

        int r1 = 1 + 3 * 4; // primero multiplica: 3 * 4 = 12, luego suma 1 = 13
        int r2 = (1 + 3) * 4; // primero suma: 1 + 3 = 4, luego multiplica = 16
        System.out.println("1 + 3 * 4 = " + r1);
        System.out.println("(1 + 3) * 4 = " + r2);
    }
}