// Clase para demostrar la inferencia de tipos con 'var'
public class EjemplosInferencia {
    public static void main(String[] args) {
        // Uso de 'var' para inferencia de tipos a partir del valor asignado

        var saludo = "¡Hola Mundo!"; // Se infiere que es de tipo String
        var numeroEntero = 7; // Se infiere que es de tipo int
        var numeroDecimal = 123.456; // Se infiere que es de tipo double

        // Mostrar los resultados por consola
        System.out.println(saludo);
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número decimal: " + numeroDecimal);

        // Nota: no se puede usar 'var' sin asignar un valor
        // var x;  // ❌ Esto causaría un error de compilación
    }
}