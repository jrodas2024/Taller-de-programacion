package tarea.semana2;

/**
 *
 * @author Server
 */
import java.util.Scanner;
import java.lang.Math;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();
        
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
    }
}

