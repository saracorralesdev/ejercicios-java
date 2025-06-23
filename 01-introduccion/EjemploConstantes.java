// Clase para mostrar cómo se declaran constantes en Java
public class EjemploConstantes {
    public static void main(String[] args) {
        // Las constantes se declaran con 'final', se escriben en MAYÚSCULAS y usan _ para separar palabras
        // ❌ No se pueden cambiar después de su declaración

        // Constante de tipo float
        final float PI = 3.141592f;
        // PI = 3; // ❌ Error

        // Constante de tipo entero
        final int UNIDAD = 1;

        // Constante de tipo String
        final String EL_SALUDO = "¡Hola Mundo!";

        // Mostrar los resultados por consola
        System.out.println("PI = " + PI);
        System.out.println("UNIDAD = " + UNIDAD);
        System.out.println("EL_SALUDO = " + EL_SALUDO);
    }
}