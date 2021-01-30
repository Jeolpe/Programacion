/*
 *@utor Jesús María Olalla Pérez 
 */
package array;

public class ArrayUni {
  
  public static int [] generarNumerosAleatorios(int z, int m, int M){
    int[] x = new int[z];
    for(int i = 0; i < x.length; i++){
      x[i] = (int)(Math.random()*(M-m+1)+m);
      }
      return x;
    }
  
  public static void mostarUno(int[] uni){
    for(int i = 0; i < uni.length; i++){
      System.out.printf("%-4d",uni[i]);
      }
    }
	
 public static void mostrarDos(int[] uni){
   for(int num:uni){
     System.out.printf("%-4d",num);;
     }
   }
}

