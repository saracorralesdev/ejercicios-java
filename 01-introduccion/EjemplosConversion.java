// Clase para demostrar conversiones automáticas y explícitas entre tipos numéricos en Java
public class EjemplosConversion {

    public static void main(String[] args) {

        // Conversiones automáticas
        // Java convierte el tipo por ti (sin necesidad de casting)
        System.out.println("----- Conversiones automáticas -----");

        // Conversión de int a long (sin pérdida de información)
        int i = 1234567;
        long l = i;
        System.out.println("De int a long");
        System.out.println("i = " + i);
        System.out.println("l = " + l);

        // Conversión de short a int (sin pérdida de información)
        short s = 1234;
        int i2 = s;
        System.out.println();
        System.out.println("De short a int");
        System.out.println("s = " + s);
        System.out.println("i2 = " + i2);

        // Conversión de int a double (sin pérdida de información)
        double d = i;
        System.out.println();
        System.out.println("De int a double");
        System.out.println("i = " + i);
        System.out.println("d = " + d);

        // Conversión de long a float (puede perder precisión si el número es muy grande)
        long l2 = 123_456_789_123_456L;
        float f2 = l2;
        System.out.println();
        System.out.println("De long a float");
        System.out.println("l2 = " + l2);
        System.out.printf("f2 = %.2f", f2);
        System.out.println();

        // long -> double (mejor precisión que con float)
        double d2 = l2;
        System.out.println();
        System.out.println("De long a double");
        System.out.println("l2 = " + l2);
        System.out.printf("d2 = %.2f", d2);
        System.out.println();

        // Comparativa visual de pérdida de información
        int big = 1234567890;
        float approx = big;
        System.out.println();
        System.out.println("De int a float");
        System.out.println("big = " + big);
        System.out.println("approx = " + approx);
        System.out.println("Diferencia: " + (big - (int) approx));
        System.out.println();

        // Conversiones explícitas (CASTING)
        // Tú le dices a Java que convierta el tipo con un "cast"
        System.out.println("----- Conversiones explícitas -----");

        // Conversión de int a short (sin pérdida porque entra en el rango)
        int i3 = 1234;
        short s3 = (short) i3;
        System.out.println("De int a short (sin pérdida)");
        System.out.println("i3 = " + i3);
        System.out.println("s3 = " + s3);

        // Conversión de int a short (con pérdida, fuera del rango de short)
        int i4 = 12345678;
        short s4 = (short) i4;
        System.out.println();
        System.out.println("De int a short (con pérdida)");
        System.out.println("i4 = " + i4);
        System.out.println("s4 = " + s4);

        // Conversión de double a float (con pérdida de precisión)
        double d3 = 123456.789;
        float f3 = (float) d3;
        System.out.println();
        System.out.println("De double a float");
        System.out.println("d3 = " + d3);
        System.out.println("f3 = " + f3);
    }
}