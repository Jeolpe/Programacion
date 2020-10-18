/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class Ejercicio9 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    double num_uno = 0;
    double num_dos = 0;
    double num_tres = 0;
    double resultado = 0;
    
    System.out.println("Este programa resuelve ecuaciones de segundo grado.");
    System.out.println("ax^2 + bx + c = 0");
    System.out.println("Por favor, introduzca los valores.");

    System.out.print("a = ");
    num_uno = s.nextDouble();

    System.out.print("b = ");
    num_dos = s.nextDouble();

    System.out.print("c = ");
    num_tres = s.nextDouble();


    if ((num_uno == 0) && (num_dos == 0) && (num_tres == 0)) {
    System.out.println("La ecuación tiene infinitas soluciones.");
     }


    if ((num_uno == 0) && (num_dos == 0) && (num_tres != 0)) {
    System.out.println("La ecuación no tiene solución.");
    }

    if ((num_uno != 0) && (num_dos != 0) && (num_tres == 0)) {
    System.out.println("x1 = 0");
    System.out.println("x2 = " + (-num_dos / num_uno));
    }

    if ((num_uno == 0) && (num_dos != 0) && (num_tres != 0)) {
    System.out.println("x1 = x2 = " + (-num_tres / num_dos));
     }

    if ((num_uno != 0) && (num_dos != 0) && (num_tres != 0)) {
     resultado = num_dos*num_dos - (4 * num_uno * num_tres);
    
    if (resultado < 0) {
    System.out.println("La ecuación no tiene soluciones reales");
    } else {

    System.out.println("x1 = " + (-num_dos + Math.sqrt(resultado))/(2 * num_uno));

    System.out.println("x2 = " + (-num_dos - Math.sqrt(resultado))/(2 * num_uno));
      }
    }
  }
}

