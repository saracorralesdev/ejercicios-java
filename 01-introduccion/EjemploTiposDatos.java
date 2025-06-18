// Clase para mostrar ejemplos de distintos tipos de datos en Java
public class EjemploTiposDatos {
    public static void main(String[] args) {

        // Tipos enteros
        byte b = 5;                        // byte: ocupa 1 byte, rango de -128 a 127
        short s = 125;                     // short: ocupa 2 bytes, rango de -32,768 a 32,767
        int i = 123456789;                // int: ocupa 4 bytes, valor entero estándar
        long l = 987654321L;              // long: ocupa 8 bytes, requiere la 'L' al final
        long l2 = 123_456_789_123L;       // Se pueden usar guiones bajos para mejorar la legibilidad

        // Tipos decimales
        float decimalPequeno = 123.456f;        // float: ocupa 4 bytes, requiere la 'f' al final
        double decimalGrande = 12345678.99999; // double: ocupa 8 bytes, mayor precisión que float
        double notacionCientifica = 1.23456E-10; // Notación científica

    }
}
