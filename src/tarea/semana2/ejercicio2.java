package tarea.semana2;

/**
 *
 * @author Server
 */
import java.util.Scanner;
import java.lang.Math;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número (puede ser negativo): ");
        double numero = scanner.nextDouble();
        
        double valorAbsoluto = Math.abs(numero);
        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
    }
}
