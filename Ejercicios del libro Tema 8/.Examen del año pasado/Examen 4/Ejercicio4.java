/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio4 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    String secret = "Supercalifragilisticoespialidoso";
    char[] palabras = generarArray(secret);
    int[] a = eliminarRepetidos(palabras);
   
    int count = 5;
    String respuesta = "";
    
    System.out.println("¡Juego de adivina la plabra!");
    System.out.println("");
    
    System.out.print("La palabra desordenada es: ");
    for(int num:a){
      System.out.print(palabras[num]);
      }
      System.out.println();
      System.out.println();
      
      do{
        if(count == 5){
        System.out.print("Te quedan " + count+" intentos. Di qué palabra es: ");
        respuesta = sc.nextLine();
        count--;
      }else{
        System.out.print("Palabra incorrecta. te quedan " + count + " intentos. Di que palabra es: ");
        respuesta = sc.nextLine();
        count--;
        }
        }while(!(respuesta.equals("Supercalifragilisticoespialidoso")) && count != 0);
        
        System.out.println();
        System.out.println();
        System.out.print("GAME OVER!");
		
	}
  
  public static char[] generarArray(String x){
    char[] palabra = new char[x.length()];
    for(int i = 0; i < x.length(); i++){
      palabra[i] = x.charAt(i);
      }
      return palabra;
    }
    
    public static int[] eliminarRepetidos(char[] words){
      int[] uni = new int[words.length];
      for(int i = 0; i < uni.length; i++){
        uni[i] = -1;
        }
      int aleatorio = 0;
      for(int i = 0; i < uni.length;i++){
      do{
        aleatorio = (int)(Math.random()*(uni.length));
          }while(esRepetido(uni,aleatorio));
          uni[i] = aleatorio;
          
        }
      
      return uni;
    }
    
      public static boolean esRepetido(int[] uni, int x){
        boolean capturado = false;
        for(int i = 0; i < uni.length; i++){
          if(uni[i] == x){
         capturado = true;
          }
          
        }
        return capturado;
      }
      
}

