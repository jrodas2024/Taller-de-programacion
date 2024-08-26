package tarea.semana2;

/**
 *
 * @author Server
 */
import java.util.Scanner;
import java.lang.Math;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Ingresa el tercer número: ");
        double num3 = scanner.nextDouble();
        
        double maximo = Math.max(Math.max(num1, num2), num3);
        System.out.println("El mayor de los tres números es: " + maximo);
    }
}