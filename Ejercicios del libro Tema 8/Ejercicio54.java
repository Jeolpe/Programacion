/*
 * @utor Jesús María Olalla Pérez
 * 1º DAW Programación
 */

import Arreglos.arrays;
import Matematicas.Primary;

import java.util.Scanner;

public class Ejercicio54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el dígito que quieras saber cuantas ocurrencias tiene: ");
        int digito = sc.nextInt();

        System.out.print("Escribe un número entero positivo: ");
        int num = sc.nextInt();

        System.out.println();
        System.out.println("Devuelve " + ocurrencias(digito, num) + " ocurrencias");
        System.out.println();

        System.out.print("Escribe el tamaño que quieres que tenga el Array Unidimensional: ");
        int tamanio = sc.nextInt();

        System.out.print("Escribe el número mínimo del Array Unidimensional: ");
        int minimo = sc.nextInt();

        System.out.print("Escribe el número Maximo del Array Unidimensional: ");
        int Maximo = sc.nextInt();

        int[] a = arrays.generaArray(tamanio, minimo, Maximo);
        System.out.println();
        System.out.println("El Array Unidimensional original es: ");
        arrays.mostrarArray(a);
        System.out.println();

        System.out.println("Escribe el número que desea saber las ocurrencias: ");
        int numArr = sc.nextInt();

        System.out.println();
        System.out.println("El número de ocurrencias es: " + ocurrencias(numArr, a));

    }

    public static int ocurrencias(int digito, int n) {
        int x = n;
        int count = 0;
        x = Primary.pegaDigitoPorDelante(x, 1);

        while (x > 0) {
            int aux = x % 10;
            if (aux == digito) {
                count++;
            }
            x /= 10;
        }
        return count;
    }

    public static int ocurrencias(int digito, int[] a) {
        int count = 0;
        for (int num : a) {
            while (num > 0) {
                int aux = num % 10;
                if (aux == digito) {
                    count++;
                }
                num /= 10;
            }
        }
        return count;
    }
}

