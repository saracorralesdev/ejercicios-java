// Clase para mostrar ejemplos del Operador Ternario en Java
public class EjemplosOperadorTernario {
    public static void main(String[] args) {
        // condición ? valor_si_verdadero : valor_si_falso;

        // Ejemplo 1: Edad para determinar si es mayor o menor de edad
        int edad = 15;
        String mensajeEdad = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
        System.out.println(mensajeEdad);

        // Ejemplo 2: Determinar si un número es par o impar
        int numero = 9;
        String mensajeParImpar = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println(mensajeParImpar);

        // Ejemplo 3: Determinar si un número es positivo, negativo o cero (usando ternario anidado)
        int valor = -7;
        String tipoValor = (valor > 0) ? "Positivo" : (valor < 0) ? "Negativo" : "Cero";
        System.out.println(tipoValor);
    }
}
