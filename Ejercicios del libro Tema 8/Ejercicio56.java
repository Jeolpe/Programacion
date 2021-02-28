/*
 * @utor Jesús María Olalla Pérez
 * 1º DAW Programación
 */

import Arreglos.arrays;

import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el número de filas: ");
        int filas = sc.nextInt();

        System.out.print("Escribe el número de columnas: ");
        int columnas = sc.nextInt();

        System.out.print("Escribe el número minimo de la Matriz: ");
        int minimo = sc.nextInt();

        System.out.print("Escribe el número Máximo de la Matriz: ");
        int Maximo = sc.nextInt();

        int[][] a = generarMatriz(filas, columnas, minimo, Maximo);

        System.out.println("La Matriz original es: ");
        mostrarMatriz(a);

        System.out.println();
        int[] b = corteza(a);
        System.out.println("La corteza de la Matriz es: ");
        arrays.mostrarArray(b);

    }

    public static int[][] generarMatriz(int filas, int columnas, int minimo, int Maximo) {
        int[][] Matriz = new int[filas][columnas];

        if (minimo > Maximo) {
            int aux = Maximo;
            Maximo = minimo;
            minimo = aux;
        }

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                Matriz[i][j] = (int) (Math.random() * (Maximo - minimo + 1)) + 1;
            }
            System.out.println();
        }
        return Matriz;
    }

    public static void mostrarMatriz(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.printf("%5d", x[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] corteza(int[][] x) {
        int[] arr = new int[(x.length * 2) + ((x[0].length * 2) - 4)];
        int[] aux = new int[x[0].length];
        int[] aux2 = new int[x.length - 2];
        int contCorteza = 0;
        int countAux = 0;
        int countAux2 = 0;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                if (i == 0) {
                    arr[contCorteza++] = x[0][j];
                }
                if ((i > 0 && i < x.length - 1) && (j == x[0].length - 1)) {
                    arr[contCorteza++] = x[i][x[0].length - 1];
                }
                if (i == x.length - 1) {
                    aux[countAux++] = x[x.length - 1][j];
                }
                if ((i > 0 && i < x.length - 1) && (j == 0)) {
                    aux2[countAux2++] = x[i][0];
                }
            }
        }
        for (int i = x[0].length - 1; i >= 0; i--) {
            arr[contCorteza++] = aux[i];
        }
        for (int i = x.length - 3; i >= 0; i--) {
            arr[contCorteza++] = aux2[i];
        }
        return arr;
    }
}
