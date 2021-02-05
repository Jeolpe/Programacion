/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class ExamenA3 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    String frase = "";
    char c_uno, c_dos, respuesta;
    int count = 0;
    do{
    if(count == 0 ){
    System.out.print("Escriba una frase: ");
    frase = sc.nextLine();
    }else{
      System.out.println("frase inicial: " + frase + ".");
      }    
    System.out.print("Indique la letra que desea sustituir: ");
    c_uno = sc.next().charAt(0);
    
    System.out.print("Indique la letra sustituida: ");
    c_dos = sc.next().charAt(0);
    
     System.out.println("Frase original: " + frase+ ".");
     System.out.println("frase alterada: " + sustituirFrase(frase, c_uno, c_dos)+ ".");
     System.out.print("¿Desea salir? s/n:");
     respuesta = sc.next().charAt(0);
     frase = sustituirFrase(frase, c_uno, c_dos);
     count++;
     
     }while(respuesta == 'n');
      
    System.out.println("");
    System.out.print("Muchas gracias, ¡Hasta Pronto!");
  }
  
  public static String sustituirFrase(String uni, char x, char y){
    String frasaca = "";
    for(int i = 0; i < uni.length(); i++){
      if(uni.charAt(i) == x){
        frasaca = frasaca + y;
        }else{
        frasaca = frasaca + uni.charAt(i);
          }
      }
      return frasaca;
    }
}

