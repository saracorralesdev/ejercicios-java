// Clase para mostrar ejemplos de operadores lógicos en Java
public class EjemplosOperadoresLogicos {
    public static void main(String[] args) {

        /* && (AND lógico): true solo si ambas condiciones son true
         * || (OR lógico): true si al menos una condición es true
         * ! (NOT lógico): invierte el valor (true pasa a false, y viceversa)
         */
        System.out.println("----- Operadores Lógicos -----");

        boolean a = true;
        boolean b = false;

        // && (AND lógico)
        System.out.println("a && b → " + (a && b)); // false
        System.out.println("true && true → " + (true && true)); // true

        System.out.println();

        // || (OR lógico)
        System.out.println("a || b → " + (a || b)); // true
        System.out.println("false || false → " + (false || false)); // false

        System.out.println();

        // ! (NOT lógico)
        System.out.println("!a → " + (!a)); // false
        System.out.println("!b → " + (!b)); // true

        System.out.println();

        // Ejemplo práctico
        int edad = 20;
        boolean esMayorDeEdad = edad >= 18;
        boolean tieneCarnet = true;

        System.out.println("¿Puede conducir?");
        System.out.println("Mayor de edad Y tiene carnet → " + (esMayorDeEdad && tieneCarnet)); // true

        boolean llevaGafas = false;
        System.out.println("Mayor de edad O lleva gafas → " + (esMayorDeEdad || llevaGafas)); // true

        System.out.println("No tiene carnet → " + (!tieneCarnet)); // false
    }
}