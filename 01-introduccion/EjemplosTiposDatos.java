// Clase para mostrar ejemplos de distintos tipos de datos en Java
public class EjemplosTiposDatos {
    public static void main(String[] args) {

        // Tipos enteros
        byte edad = 5; // byte: ocupa 1 byte, rango de -128 a 127
        short stock = 125; // short: ocupa 2 bytes, rango de -32,768 a 32,767
        int usuarios = 123456789; // int: ocupa 4 bytes, valor entero estándar
        long visitas = 987654321L; // long: ocupa 8 bytes, requiere la 'L' al final
        long presupuesto = 123_456_789_123L; // Se pueden usar '_' para mejorar la legibilidad

        // Tipos decimales
        float nota = 5.45f; // float: ocupa 4 bytes, requiere la 'f' al final
        double saldo = 12345678.99999; // double: ocupa 8 bytes, mayor precisión que float
        double numCientifico = 1.23456E-10; // Notación científica

        // Tipo booleano
        boolean condicion = true; // true o false

        // Tipos caracteres y cadenas
        char inicial = 's'; // Un solo carácter, comillas simples
        String saludo = "¡Hola Mundo!"; // Cadena de texto, comillas dobles

        // Mostrar los resultados por consola
        System.out.println("Edad: " + edad);
        System.out.println("Stock: " + stock);
        System.out.println("Usuarios: " + usuarios);
        System.out.println("Visitas: " + visitas);
        System.out.println("Presupuesto: " + presupuesto);
        System.out.println("Nota: " + nota);
        System.out.println("Saldo: " + saldo);
        System.out.println("Número en notación científica: " + numCientifico);
        System.out.println("Condición: " + condicion);
        System.out.println("Inicial: " + inicial);
        System.out.println("Saludo: " + saludo);
    }
}
