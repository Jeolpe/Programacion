/*
 *@utor Jesús María Olalla Pérez 
 */
import array.ArrayUni;
import java.util.Scanner;
public class Ejercicio36 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int c = 0;
    int min = 0;
    int Max = 0;
    
    System.out.print("Escribe la cantidad de Array Unidimensional: ");
    c = sc.nextInt();
    
    System.out.print("Escribe el mínimo: ");
    min = sc.nextInt();
    
    System.out.print("Escribe el Máximo: ");
    Max = sc.nextInt();
		
    int[] a = array.ArrayUni.generarNumerosAleatorios(c, min, Max);
    int[] b = filtraPrimos(a,c);
    System.out.println("Estos números ha generado el Array Unidimensional con números aleatorios: ");
    ArrayUni.mostrarDos(a);
    System.out.println("");
    
    System.out.println("Estos son los números primos: ");
    ArrayUni.mostrarDos(b);
	}
  
  
    public static boolean esPrimo(int x){
    for(int  i= 2; i < x; i++ ){
      if(x%i != 0){
        return true;
        }
        return false;
      }
      return false;
    }
    
    public static int contador(int[] uni){
      int contador = 0;
      for(int num:uni){
        if(esPrimo(num)){
          contador++;
          }
        }
        return contador;
      } 
    
    public static int[] filtraPrimos(int[] uni, int z) { 
      int contador = 0;
      int[] x = new int[contador(uni)];
      for(int num:uni){
        if(esPrimo(num)){
          x[contador] = num;
          contador++;
          }
        }
        return x;
    }


}

